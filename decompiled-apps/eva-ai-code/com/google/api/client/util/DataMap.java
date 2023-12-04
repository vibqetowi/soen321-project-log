package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DataMap extends AbstractMap<String, Object> {
    final ClassInfo classInfo;
    final Object object;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataMap(Object obj, boolean z) {
        this.object = obj;
        this.classInfo = ClassInfo.of(obj.getClass(), z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public EntrySet entrySet() {
        return new EntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        FieldInfo fieldInfo;
        if ((obj instanceof String) && (fieldInfo = this.classInfo.getFieldInfo((String) obj)) != null) {
            return fieldInfo.getValue(this.object);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(String str, Object obj) {
        FieldInfo fieldInfo = this.classInfo.getFieldInfo(str);
        Preconditions.checkNotNull(fieldInfo, "no field of key " + str);
        Object value = fieldInfo.getValue(this.object);
        fieldInfo.setValue(this.object, Preconditions.checkNotNull(obj));
        return value;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class EntrySet extends AbstractSet<Map.Entry<String, Object>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public EntryIterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (String str : DataMap.this.classInfo.names) {
                if (DataMap.this.classInfo.getFieldInfo(str).getValue(DataMap.this.object) != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            for (String str : DataMap.this.classInfo.names) {
                DataMap.this.classInfo.getFieldInfo(str).setValue(DataMap.this.object, null);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            for (String str : DataMap.this.classInfo.names) {
                if (DataMap.this.classInfo.getFieldInfo(str).getValue(DataMap.this.object) != null) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class EntryIterator implements Iterator<Map.Entry<String, Object>> {
        private FieldInfo currentFieldInfo;
        private boolean isComputed;
        private boolean isRemoved;
        private FieldInfo nextFieldInfo;
        private Object nextFieldValue;
        private int nextKeyIndex = -1;

        EntryIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.isComputed) {
                this.isComputed = true;
                this.nextFieldValue = null;
                while (this.nextFieldValue == null) {
                    int i = this.nextKeyIndex + 1;
                    this.nextKeyIndex = i;
                    if (i >= DataMap.this.classInfo.names.size()) {
                        break;
                    }
                    FieldInfo fieldInfo = DataMap.this.classInfo.getFieldInfo(DataMap.this.classInfo.names.get(this.nextKeyIndex));
                    this.nextFieldInfo = fieldInfo;
                    this.nextFieldValue = fieldInfo.getValue(DataMap.this.object);
                }
            }
            return this.nextFieldValue != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<String, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            FieldInfo fieldInfo = this.nextFieldInfo;
            this.currentFieldInfo = fieldInfo;
            Object obj = this.nextFieldValue;
            this.isComputed = false;
            this.isRemoved = false;
            this.nextFieldInfo = null;
            this.nextFieldValue = null;
            return new Entry(fieldInfo, obj);
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState((this.currentFieldInfo == null || this.isRemoved) ? false : true);
            this.isRemoved = true;
            this.currentFieldInfo.setValue(DataMap.this.object, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class Entry implements Map.Entry<String, Object> {
        private final FieldInfo fieldInfo;
        private Object fieldValue;

        Entry(FieldInfo fieldInfo, Object obj) {
            this.fieldInfo = fieldInfo;
            this.fieldValue = Preconditions.checkNotNull(obj);
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            String name = this.fieldInfo.getName();
            return DataMap.this.classInfo.getIgnoreCase() ? name.toLowerCase(Locale.US) : name;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.fieldValue;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.fieldValue;
            this.fieldValue = Preconditions.checkNotNull(obj);
            this.fieldInfo.setValue(DataMap.this.object, obj);
            return obj2;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }
            return false;
        }
    }
}
