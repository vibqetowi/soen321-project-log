package com.google.firebase.database.core;

import com.google.firebase.database.core.ValueProvider;
import com.google.firebase.database.core.utilities.Clock;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityUtilities;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class ServerValues {
    public static final String NAME_OP_INCREMENT = "increment";
    public static final String NAME_OP_TIMESTAMP = "timestamp";
    public static final String NAME_SUBKEY_SERVERVALUE = ".sv";

    private static boolean canBeRepresentedAsLong(Number number) {
        if (!(number instanceof Double) && !(number instanceof Float)) {
            return true;
        }
        return false;
    }

    public static Map<String, Object> generateServerValues(Clock clock) {
        HashMap hashMap = new HashMap();
        hashMap.put(NAME_OP_TIMESTAMP, Long.valueOf(clock.millis()));
        return hashMap;
    }

    public static Object resolveComplexDeferredValue(Map<String, Object> map, ValueProvider valueProvider, Map<String, Object> map2) {
        if (!map.containsKey(NAME_OP_INCREMENT)) {
            return null;
        }
        Object obj = map.get(NAME_OP_INCREMENT);
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        Node node = valueProvider.node();
        if (node.isLeafNode() && (node.getValue() instanceof Number)) {
            Number number2 = (Number) node.getValue();
            if (canBeRepresentedAsLong(number) && canBeRepresentedAsLong(number2)) {
                long longValue = number.longValue();
                long longValue2 = number2.longValue();
                long j10 = longValue + longValue2;
                if (((longValue ^ j10) & (longValue2 ^ j10)) >= 0) {
                    return Long.valueOf(j10);
                }
            }
            return Double.valueOf(number2.doubleValue() + number.doubleValue());
        }
        return number;
    }

    public static Object resolveDeferredLeafValue(Object obj, ValueProvider valueProvider, Map<String, Object> map) {
        Object obj2;
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(NAME_SUBKEY_SERVERVALUE)) {
            return obj;
        }
        Object obj3 = map2.get(NAME_SUBKEY_SERVERVALUE);
        if (obj3 instanceof String) {
            obj2 = resolveScalarDeferredValue((String) obj3, map);
        } else if (obj3 instanceof Map) {
            obj2 = resolveComplexDeferredValue((Map) obj3, valueProvider, map);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return obj;
        }
        return obj2;
    }

    public static CompoundWrite resolveDeferredValueMerge(CompoundWrite compoundWrite, SyncTree syncTree, Path path, Map<String, Object> map) {
        CompoundWrite emptyWrite = CompoundWrite.emptyWrite();
        Iterator<Map.Entry<Path, Node>> it = compoundWrite.iterator();
        while (it.hasNext()) {
            Map.Entry<Path, Node> next = it.next();
            emptyWrite = emptyWrite.addWrite(next.getKey(), resolveDeferredValueSnapshot(next.getValue(), new ValueProvider.DeferredValueProvider(syncTree, path.child(next.getKey())), map));
        }
        return emptyWrite;
    }

    public static Node resolveDeferredValueSnapshot(Node node, Node node2, Map<String, Object> map) {
        return resolveDeferredValueSnapshot(node, new ValueProvider.ExistingValueProvider(node2), map);
    }

    public static Object resolveScalarDeferredValue(String str, Map<String, Object> map) {
        if (NAME_OP_TIMESTAMP.equals(str) && map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public static Node resolveDeferredValueSnapshot(Node node, SyncTree syncTree, Path path, Map<String, Object> map) {
        return resolveDeferredValueSnapshot(node, new ValueProvider.DeferredValueProvider(syncTree, path), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Node resolveDeferredValueSnapshot(Node node, final ValueProvider valueProvider, final Map<String, Object> map) {
        Object value = node.getPriority().getValue();
        Object resolveDeferredLeafValue = resolveDeferredLeafValue(value, valueProvider.getImmediateChild(ChildKey.fromString(".priority")), map);
        if (node.isLeafNode()) {
            Object resolveDeferredLeafValue2 = resolveDeferredLeafValue(node.getValue(), valueProvider, map);
            return (resolveDeferredLeafValue2.equals(node.getValue()) && Utilities.equals(resolveDeferredLeafValue, value)) ? node : NodeUtilities.NodeFromJSON(resolveDeferredLeafValue2, PriorityUtilities.parsePriority(resolveDeferredLeafValue));
        } else if (node.isEmpty()) {
            return node;
        } else {
            ChildrenNode childrenNode = (ChildrenNode) node;
            final SnapshotHolder snapshotHolder = new SnapshotHolder(childrenNode);
            childrenNode.forEachChild(new ChildrenNode.ChildVisitor() { // from class: com.google.firebase.database.core.ServerValues.1
                @Override // com.google.firebase.database.snapshot.ChildrenNode.ChildVisitor
                public void visitChild(ChildKey childKey, Node node2) {
                    Node resolveDeferredValueSnapshot = ServerValues.resolveDeferredValueSnapshot(node2, ValueProvider.this.getImmediateChild(childKey), map);
                    if (resolveDeferredValueSnapshot != node2) {
                        snapshotHolder.update(new Path(childKey.asString()), resolveDeferredValueSnapshot);
                    }
                }
            });
            if (!snapshotHolder.getRootNode().getPriority().equals(resolveDeferredLeafValue)) {
                return snapshotHolder.getRootNode().updatePriority(PriorityUtilities.parsePriority(resolveDeferredLeafValue));
            }
            return snapshotHolder.getRootNode();
        }
    }
}
