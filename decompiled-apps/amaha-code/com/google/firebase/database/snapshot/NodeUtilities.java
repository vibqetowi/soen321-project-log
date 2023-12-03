package com.google.firebase.database.snapshot;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.core.ServerValues;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class NodeUtilities {
    public static Node NodeFromJSON(Object obj) {
        return NodeFromJSON(obj, PriorityUtilities.NullPriority());
    }

    public static int nameAndPriorityCompare(ChildKey childKey, Node node, ChildKey childKey2, Node node2) {
        int compareTo = node.compareTo(node2);
        if (compareTo != 0) {
            return compareTo;
        }
        return childKey.compareTo(childKey2);
    }

    public static Node NodeFromJSON(Object obj, Node node) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    node = PriorityUtilities.parsePriority(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return EmptyNode.Empty();
            }
            if (obj instanceof String) {
                return new StringNode((String) obj, node);
            }
            if (obj instanceof Long) {
                return new LongNode((Long) obj, node);
            }
            if (obj instanceof Integer) {
                return new LongNode(Long.valueOf(((Integer) obj).intValue()), node);
            }
            if (obj instanceof Double) {
                return new DoubleNode((Double) obj, node);
            }
            if (obj instanceof Boolean) {
                return new BooleanNode((Boolean) obj, node);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new DatabaseException("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(ServerValues.NAME_SUBKEY_SERVERVALUE)) {
                    return new DeferredValueNode(map2, node);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        Node NodeFromJSON = NodeFromJSON(map2.get(str));
                        if (!NodeFromJSON.isEmpty()) {
                            hashMap.put(ChildKey.fromString(str), NodeFromJSON);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i6 = 0; i6 < list.size(); i6++) {
                    String str2 = "" + i6;
                    Node NodeFromJSON2 = NodeFromJSON(list.get(i6));
                    if (!NodeFromJSON2.isEmpty()) {
                        hashMap.put(ChildKey.fromString(str2), NodeFromJSON2);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return EmptyNode.Empty();
            }
            return new ChildrenNode(ImmutableSortedMap.Builder.fromMap(hashMap, ChildrenNode.NAME_ONLY_COMPARATOR), node);
        } catch (ClassCastException e10) {
            throw new DatabaseException("Failed to parse node", e10);
        }
    }
}
