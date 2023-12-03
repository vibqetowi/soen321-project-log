package com.google.firebase.database.core.view;

import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes.dex */
public class Change {
    private final ChildKey childKey;
    private final Event.EventType eventType;
    private final IndexedNode indexedNode;
    private final IndexedNode oldIndexedNode;
    private final ChildKey prevName;

    private Change(Event.EventType eventType, IndexedNode indexedNode, ChildKey childKey, ChildKey childKey2, IndexedNode indexedNode2) {
        this.eventType = eventType;
        this.indexedNode = indexedNode;
        this.childKey = childKey;
        this.prevName = childKey2;
        this.oldIndexedNode = indexedNode2;
    }

    public static Change childAddedChange(ChildKey childKey, Node node) {
        return childAddedChange(childKey, IndexedNode.from(node));
    }

    public static Change childChangedChange(ChildKey childKey, Node node, Node node2) {
        return childChangedChange(childKey, IndexedNode.from(node), IndexedNode.from(node2));
    }

    public static Change childMovedChange(ChildKey childKey, Node node) {
        return childMovedChange(childKey, IndexedNode.from(node));
    }

    public static Change childRemovedChange(ChildKey childKey, Node node) {
        return childRemovedChange(childKey, IndexedNode.from(node));
    }

    public static Change valueChange(IndexedNode indexedNode) {
        return new Change(Event.EventType.VALUE, indexedNode, null, null, null);
    }

    public Change changeWithPrevName(ChildKey childKey) {
        return new Change(this.eventType, this.indexedNode, this.childKey, childKey, this.oldIndexedNode);
    }

    public ChildKey getChildKey() {
        return this.childKey;
    }

    public Event.EventType getEventType() {
        return this.eventType;
    }

    public IndexedNode getIndexedNode() {
        return this.indexedNode;
    }

    public IndexedNode getOldIndexedNode() {
        return this.oldIndexedNode;
    }

    public ChildKey getPrevName() {
        return this.prevName;
    }

    public String toString() {
        return "Change: " + this.eventType + " " + this.childKey;
    }

    public static Change childAddedChange(ChildKey childKey, IndexedNode indexedNode) {
        return new Change(Event.EventType.CHILD_ADDED, indexedNode, childKey, null, null);
    }

    public static Change childMovedChange(ChildKey childKey, IndexedNode indexedNode) {
        return new Change(Event.EventType.CHILD_MOVED, indexedNode, childKey, null, null);
    }

    public static Change childRemovedChange(ChildKey childKey, IndexedNode indexedNode) {
        return new Change(Event.EventType.CHILD_REMOVED, indexedNode, childKey, null, null);
    }

    public static Change childChangedChange(ChildKey childKey, IndexedNode indexedNode, IndexedNode indexedNode2) {
        return new Change(Event.EventType.CHILD_CHANGED, indexedNode, childKey, null, indexedNode2);
    }
}
