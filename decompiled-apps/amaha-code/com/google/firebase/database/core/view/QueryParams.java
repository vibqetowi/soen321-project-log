package com.google.firebase.database.core.view;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.filter.IndexedFilter;
import com.google.firebase.database.core.view.filter.LimitedFilter;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.core.view.filter.RangedFilter;
import com.google.firebase.database.snapshot.BooleanNode;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.DoubleNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.LongNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityIndex;
import com.google.firebase.database.snapshot.PriorityUtilities;
import com.google.firebase.database.snapshot.StringNode;
import com.google.firebase.database.util.JsonMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class QueryParams {
    public static final QueryParams DEFAULT_PARAMS = new QueryParams();
    private static final String INDEX = "i";
    private static final String INDEX_END_NAME = "en";
    private static final String INDEX_END_VALUE = "ep";
    private static final String INDEX_START_NAME = "sn";
    private static final String INDEX_START_VALUE = "sp";
    private static final String LIMIT = "l";
    private static final String VIEW_FROM = "vf";
    private Integer limit;
    private ViewFrom viewFrom;
    private Node indexStartValue = null;
    private ChildKey indexStartName = null;
    private Node indexEndValue = null;
    private ChildKey indexEndName = null;
    private Index index = PriorityIndex.getInstance();
    private String jsonSerialization = null;

    /* renamed from: com.google.firebase.database.core.view.QueryParams$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom;

        static {
            int[] iArr = new int[ViewFrom.values().length];
            $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom = iArr;
            try {
                iArr[ViewFrom.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom[ViewFrom.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum ViewFrom {
        LEFT,
        RIGHT
    }

    private QueryParams copy() {
        QueryParams queryParams = new QueryParams();
        queryParams.limit = this.limit;
        queryParams.indexStartValue = this.indexStartValue;
        queryParams.indexStartName = this.indexStartName;
        queryParams.indexEndValue = this.indexEndValue;
        queryParams.indexEndName = this.indexEndName;
        queryParams.viewFrom = this.viewFrom;
        queryParams.index = this.index;
        return queryParams;
    }

    public static QueryParams fromQueryObject(Map<String, Object> map) {
        ViewFrom viewFrom;
        QueryParams queryParams = new QueryParams();
        queryParams.limit = (Integer) map.get(LIMIT);
        if (map.containsKey(INDEX_START_VALUE)) {
            queryParams.indexStartValue = normalizeValue(NodeUtilities.NodeFromJSON(map.get(INDEX_START_VALUE)));
            String str = (String) map.get(INDEX_START_NAME);
            if (str != null) {
                queryParams.indexStartName = ChildKey.fromString(str);
            }
        }
        if (map.containsKey(INDEX_END_VALUE)) {
            queryParams.indexEndValue = normalizeValue(NodeUtilities.NodeFromJSON(map.get(INDEX_END_VALUE)));
            String str2 = (String) map.get(INDEX_END_NAME);
            if (str2 != null) {
                queryParams.indexEndName = ChildKey.fromString(str2);
            }
        }
        String str3 = (String) map.get(VIEW_FROM);
        if (str3 != null) {
            if (str3.equals(LIMIT)) {
                viewFrom = ViewFrom.LEFT;
            } else {
                viewFrom = ViewFrom.RIGHT;
            }
            queryParams.viewFrom = viewFrom;
        }
        String str4 = (String) map.get(INDEX);
        if (str4 != null) {
            queryParams.index = Index.fromQueryDefinition(str4);
        }
        return queryParams;
    }

    private static Node normalizeValue(Node node) {
        if (!(node instanceof StringNode) && !(node instanceof BooleanNode) && !(node instanceof DoubleNode) && !(node instanceof EmptyNode)) {
            if (node instanceof LongNode) {
                return new DoubleNode(Double.valueOf(((Long) node.getValue()).doubleValue()), PriorityUtilities.NullPriority());
            }
            throw new IllegalStateException("Unexpected value passed to normalizeValue: " + node.getValue());
        }
        return node;
    }

    public QueryParams endAt(Node node, ChildKey childKey) {
        boolean z10;
        if (!node.isLeafNode() && !node.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        Utilities.hardAssert(z10);
        Utilities.hardAssert(!(node instanceof LongNode));
        QueryParams copy = copy();
        copy.indexEndValue = node;
        copy.indexEndName = childKey;
        return copy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryParams.class != obj.getClass()) {
            return false;
        }
        QueryParams queryParams = (QueryParams) obj;
        Integer num = this.limit;
        if (num == null ? queryParams.limit != null : !num.equals(queryParams.limit)) {
            return false;
        }
        Index index = this.index;
        if (index == null ? queryParams.index != null : !index.equals(queryParams.index)) {
            return false;
        }
        ChildKey childKey = this.indexEndName;
        if (childKey == null ? queryParams.indexEndName != null : !childKey.equals(queryParams.indexEndName)) {
            return false;
        }
        Node node = this.indexEndValue;
        if (node == null ? queryParams.indexEndValue != null : !node.equals(queryParams.indexEndValue)) {
            return false;
        }
        ChildKey childKey2 = this.indexStartName;
        if (childKey2 == null ? queryParams.indexStartName != null : !childKey2.equals(queryParams.indexStartName)) {
            return false;
        }
        Node node2 = this.indexStartValue;
        if (node2 == null ? queryParams.indexStartValue != null : !node2.equals(queryParams.indexStartValue)) {
            return false;
        }
        if (isViewFromLeft() == queryParams.isViewFromLeft()) {
            return true;
        }
        return false;
    }

    public Index getIndex() {
        return this.index;
    }

    public ChildKey getIndexEndName() {
        if (hasEnd()) {
            ChildKey childKey = this.indexEndName;
            if (childKey != null) {
                return childKey;
            }
            return ChildKey.getMaxName();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    public Node getIndexEndValue() {
        if (hasEnd()) {
            return this.indexEndValue;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public ChildKey getIndexStartName() {
        if (hasStart()) {
            ChildKey childKey = this.indexStartName;
            if (childKey != null) {
                return childKey;
            }
            return ChildKey.getMinName();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public Node getIndexStartValue() {
        if (hasStart()) {
            return this.indexStartValue;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public int getLimit() {
        if (hasLimit()) {
            return this.limit.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public NodeFilter getNodeFilter() {
        if (loadsAllData()) {
            return new IndexedFilter(getIndex());
        }
        if (hasLimit()) {
            return new LimitedFilter(this);
        }
        return new RangedFilter(this);
    }

    public Map<String, Object> getWireProtocolParams() {
        HashMap hashMap = new HashMap();
        if (hasStart()) {
            hashMap.put(INDEX_START_VALUE, this.indexStartValue.getValue());
            ChildKey childKey = this.indexStartName;
            if (childKey != null) {
                hashMap.put(INDEX_START_NAME, childKey.asString());
            }
        }
        if (hasEnd()) {
            hashMap.put(INDEX_END_VALUE, this.indexEndValue.getValue());
            ChildKey childKey2 = this.indexEndName;
            if (childKey2 != null) {
                hashMap.put(INDEX_END_NAME, childKey2.asString());
            }
        }
        Integer num = this.limit;
        if (num != null) {
            hashMap.put(LIMIT, num);
            ViewFrom viewFrom = this.viewFrom;
            if (viewFrom == null) {
                if (hasStart()) {
                    viewFrom = ViewFrom.LEFT;
                } else {
                    viewFrom = ViewFrom.RIGHT;
                }
            }
            int i6 = AnonymousClass1.$SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom[viewFrom.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    hashMap.put(VIEW_FROM, "r");
                }
            } else {
                hashMap.put(VIEW_FROM, LIMIT);
            }
        }
        if (!this.index.equals(PriorityIndex.getInstance())) {
            hashMap.put(INDEX, this.index.getQueryDefinition());
        }
        return hashMap;
    }

    public boolean hasAnchoredLimit() {
        if (hasLimit() && this.viewFrom != null) {
            return true;
        }
        return false;
    }

    public boolean hasEnd() {
        if (this.indexEndValue != null) {
            return true;
        }
        return false;
    }

    public boolean hasLimit() {
        if (this.limit != null) {
            return true;
        }
        return false;
    }

    public boolean hasStart() {
        if (this.indexStartValue != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num = this.limit;
        int i15 = 0;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 0;
        }
        int i16 = i6 * 31;
        if (isViewFromLeft()) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i17 = (i16 + i10) * 31;
        Node node = this.indexStartValue;
        if (node != null) {
            i11 = node.hashCode();
        } else {
            i11 = 0;
        }
        int i18 = (i17 + i11) * 31;
        ChildKey childKey = this.indexStartName;
        if (childKey != null) {
            i12 = childKey.hashCode();
        } else {
            i12 = 0;
        }
        int i19 = (i18 + i12) * 31;
        Node node2 = this.indexEndValue;
        if (node2 != null) {
            i13 = node2.hashCode();
        } else {
            i13 = 0;
        }
        int i20 = (i19 + i13) * 31;
        ChildKey childKey2 = this.indexEndName;
        if (childKey2 != null) {
            i14 = childKey2.hashCode();
        } else {
            i14 = 0;
        }
        int i21 = (i20 + i14) * 31;
        Index index = this.index;
        if (index != null) {
            i15 = index.hashCode();
        }
        return i21 + i15;
    }

    public boolean isDefault() {
        if (loadsAllData() && this.index.equals(PriorityIndex.getInstance())) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (hasStart() && hasEnd() && hasLimit() && !hasAnchoredLimit()) {
            return false;
        }
        return true;
    }

    public boolean isViewFromLeft() {
        ViewFrom viewFrom = this.viewFrom;
        if (viewFrom != null) {
            if (viewFrom == ViewFrom.LEFT) {
                return true;
            }
            return false;
        }
        return hasStart();
    }

    public QueryParams limitToFirst(int i6) {
        QueryParams copy = copy();
        copy.limit = Integer.valueOf(i6);
        copy.viewFrom = ViewFrom.LEFT;
        return copy;
    }

    public QueryParams limitToLast(int i6) {
        QueryParams copy = copy();
        copy.limit = Integer.valueOf(i6);
        copy.viewFrom = ViewFrom.RIGHT;
        return copy;
    }

    public boolean loadsAllData() {
        if (!hasStart() && !hasEnd() && !hasLimit()) {
            return true;
        }
        return false;
    }

    public QueryParams orderBy(Index index) {
        QueryParams copy = copy();
        copy.index = index;
        return copy;
    }

    public QueryParams startAt(Node node, ChildKey childKey) {
        boolean z10;
        if (!node.isLeafNode() && !node.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        Utilities.hardAssert(z10);
        Utilities.hardAssert(!(node instanceof LongNode));
        QueryParams copy = copy();
        copy.indexStartValue = node;
        copy.indexStartName = childKey;
        return copy;
    }

    public String toJSON() {
        if (this.jsonSerialization == null) {
            try {
                this.jsonSerialization = JsonMapper.serializeJson(getWireProtocolParams());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.jsonSerialization;
    }

    public String toString() {
        return getWireProtocolParams().toString();
    }
}
