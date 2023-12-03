package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import r1.b0;
/* loaded from: classes.dex */
public class ChildKey implements Comparable<ChildKey> {
    private final String key;
    public static final String MIN_KEY_NAME = "[MIN_NAME]";
    private static final ChildKey MIN_KEY = new ChildKey(MIN_KEY_NAME);
    public static final String MAX_KEY_NAME = "[MAX_KEY]";
    private static final ChildKey MAX_KEY = new ChildKey(MAX_KEY_NAME);
    private static final ChildKey PRIORITY_CHILD_KEY = new ChildKey(".priority");
    private static final ChildKey INFO_CHILD_KEY = new ChildKey(".info");

    /* loaded from: classes.dex */
    public static class IntegerChildKey extends ChildKey {
        private final int intValue;

        public IntegerChildKey(String str, int i6) {
            super(str);
            this.intValue = i6;
        }

        @Override // com.google.firebase.database.snapshot.ChildKey, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(ChildKey childKey) {
            return super.compareTo(childKey);
        }

        @Override // com.google.firebase.database.snapshot.ChildKey
        public int intValue() {
            return this.intValue;
        }

        @Override // com.google.firebase.database.snapshot.ChildKey
        public boolean isInt() {
            return true;
        }

        @Override // com.google.firebase.database.snapshot.ChildKey
        public String toString() {
            return "IntegerChildName(\"" + ((ChildKey) this).key + "\")";
        }
    }

    public static ChildKey fromString(String str) {
        Integer tryParseInt = Utilities.tryParseInt(str);
        if (tryParseInt != null) {
            return new IntegerChildKey(str, tryParseInt.intValue());
        }
        if (str.equals(".priority")) {
            return PRIORITY_CHILD_KEY;
        }
        Utilities.hardAssert(!str.contains("/"));
        return new ChildKey(str);
    }

    public static ChildKey getInfoKey() {
        return INFO_CHILD_KEY;
    }

    public static ChildKey getMaxName() {
        return MAX_KEY;
    }

    public static ChildKey getMinName() {
        return MIN_KEY;
    }

    public static ChildKey getPriorityKey() {
        return PRIORITY_CHILD_KEY;
    }

    public String asString() {
        return this.key;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChildKey)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.key.equals(((ChildKey) obj).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public int intValue() {
        return 0;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isPriorityChildName() {
        return equals(PRIORITY_CHILD_KEY);
    }

    public String toString() {
        return b0.b(new StringBuilder("ChildKey(\""), this.key, "\")");
    }

    private ChildKey(String str) {
        this.key = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(ChildKey childKey) {
        if (this == childKey) {
            return 0;
        }
        if (this.key.equals(MIN_KEY_NAME) || childKey.key.equals(MAX_KEY_NAME)) {
            return -1;
        }
        if (childKey.key.equals(MIN_KEY_NAME) || this.key.equals(MAX_KEY_NAME)) {
            return 1;
        }
        if (isInt()) {
            if (childKey.isInt()) {
                int compareInts = Utilities.compareInts(intValue(), childKey.intValue());
                return compareInts == 0 ? Utilities.compareInts(this.key.length(), childKey.key.length()) : compareInts;
            }
            return -1;
        } else if (childKey.isInt()) {
            return 1;
        } else {
            return this.key.compareTo(childKey.key);
        }
    }
}
