package com.google.firebase.database.core.view;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.annotations.Nullable;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.WriteTreeRef;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.ViewProcessor;
import com.google.firebase.database.core.view.filter.IndexedFilter;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class View {
    private final EventGenerator eventGenerator;
    private final List<EventRegistration> eventRegistrations;
    private final ViewProcessor processor;
    private final QuerySpec query;
    private ViewCache viewCache;

    /* loaded from: classes.dex */
    public static class OperationResult {
        public final List<Change> changes;
        public final List<DataEvent> events;

        public OperationResult(List<DataEvent> list, List<Change> list2) {
            this.events = list;
            this.changes = list2;
        }
    }

    public View(QuerySpec querySpec, ViewCache viewCache) {
        this.query = querySpec;
        IndexedFilter indexedFilter = new IndexedFilter(querySpec.getIndex());
        NodeFilter nodeFilter = querySpec.getParams().getNodeFilter();
        this.processor = new ViewProcessor(nodeFilter);
        CacheNode serverCache = viewCache.getServerCache();
        CacheNode eventCache = viewCache.getEventCache();
        IndexedNode from = IndexedNode.from(EmptyNode.Empty(), querySpec.getIndex());
        IndexedNode updateFullNode = indexedFilter.updateFullNode(from, serverCache.getIndexedNode(), null);
        IndexedNode updateFullNode2 = nodeFilter.updateFullNode(from, eventCache.getIndexedNode(), null);
        this.viewCache = new ViewCache(new CacheNode(updateFullNode2, eventCache.isFullyInitialized(), nodeFilter.filtersNodes()), new CacheNode(updateFullNode, serverCache.isFullyInitialized(), indexedFilter.filtersNodes()));
        this.eventRegistrations = new ArrayList();
        this.eventGenerator = new EventGenerator(querySpec);
    }

    private List<DataEvent> generateEventsForChanges(List<Change> list, IndexedNode indexedNode, EventRegistration eventRegistration) {
        List<EventRegistration> asList;
        if (eventRegistration == null) {
            asList = this.eventRegistrations;
        } else {
            asList = Arrays.asList(eventRegistration);
        }
        return this.eventGenerator.generateEventsForChanges(list, indexedNode, asList);
    }

    public void addEventRegistration(@NotNull EventRegistration eventRegistration) {
        this.eventRegistrations.add(eventRegistration);
    }

    public OperationResult applyOperation(Operation operation, WriteTreeRef writeTreeRef, Node node) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (operation.getType() == Operation.OperationType.Merge && operation.getSource().getQueryParams() != null) {
            if (this.viewCache.getCompleteServerSnap() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Utilities.hardAssert(z10, "We should always have a full cache before handling merges");
            if (this.viewCache.getCompleteEventSnap() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Utilities.hardAssert(z11, "Missing event cache, even though we have a server cache");
        }
        ViewCache viewCache = this.viewCache;
        ViewProcessor.ProcessorResult applyOperation = this.processor.applyOperation(viewCache, operation, writeTreeRef, node);
        Utilities.hardAssert((applyOperation.viewCache.getServerCache().isFullyInitialized() || !viewCache.getServerCache().isFullyInitialized()) ? true : true, "Once a server snap is complete, it should never go back");
        ViewCache viewCache2 = applyOperation.viewCache;
        this.viewCache = viewCache2;
        return new OperationResult(generateEventsForChanges(applyOperation.changes, viewCache2.getEventCache().getIndexedNode(), null), applyOperation.changes);
    }

    public Node getCompleteNode() {
        return this.viewCache.getCompleteEventSnap();
    }

    public Node getCompleteServerCache(Path path) {
        Node completeServerSnap = this.viewCache.getCompleteServerSnap();
        if (completeServerSnap != null) {
            if (this.query.loadsAllData() || (!path.isEmpty() && !completeServerSnap.getImmediateChild(path.getFront()).isEmpty())) {
                return completeServerSnap.getChild(path);
            }
            return null;
        }
        return null;
    }

    public Node getEventCache() {
        return this.viewCache.getEventCache().getNode();
    }

    public List<EventRegistration> getEventRegistrations() {
        return this.eventRegistrations;
    }

    public List<DataEvent> getInitialEvents(EventRegistration eventRegistration) {
        CacheNode eventCache = this.viewCache.getEventCache();
        ArrayList arrayList = new ArrayList();
        for (NamedNode namedNode : eventCache.getNode()) {
            arrayList.add(Change.childAddedChange(namedNode.getName(), namedNode.getNode()));
        }
        if (eventCache.isFullyInitialized()) {
            arrayList.add(Change.valueChange(eventCache.getIndexedNode()));
        }
        return generateEventsForChanges(arrayList, eventCache.getIndexedNode(), eventRegistration);
    }

    public QuerySpec getQuery() {
        return this.query;
    }

    public Node getServerCache() {
        return this.viewCache.getServerCache().getNode();
    }

    public boolean isEmpty() {
        return this.eventRegistrations.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.google.firebase.database.core.view.Event>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public List<Event> removeEventRegistration(@Nullable EventRegistration eventRegistration, DatabaseError databaseError) {
        ?? emptyList;
        boolean z10;
        int i6 = 0;
        if (databaseError != null) {
            emptyList = new ArrayList();
            if (eventRegistration == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Utilities.hardAssert(z10, "A cancel should cancel all event registrations");
            Path path = this.query.getPath();
            for (EventRegistration eventRegistration2 : this.eventRegistrations) {
                emptyList.add(new CancelEvent(eventRegistration2, databaseError, path));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (eventRegistration != null) {
            int i10 = -1;
            while (true) {
                if (i6 < this.eventRegistrations.size()) {
                    EventRegistration eventRegistration3 = this.eventRegistrations.get(i6);
                    if (eventRegistration3.isSameListener(eventRegistration)) {
                        if (eventRegistration3.isZombied()) {
                            break;
                        }
                        i10 = i6;
                    }
                    i6++;
                } else {
                    i6 = i10;
                    break;
                }
            }
            if (i6 != -1) {
                this.eventRegistrations.remove(i6);
                this.eventRegistrations.get(i6).zombify();
            }
        } else {
            for (EventRegistration eventRegistration4 : this.eventRegistrations) {
                eventRegistration4.zombify();
            }
            this.eventRegistrations.clear();
        }
        return emptyList;
    }
}
