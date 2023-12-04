package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes7.dex */
public final class ClassInfo {
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE_IGNORE_CASE = new ConcurrentHashMap();
    private final Class<?> clazz;
    private final boolean ignoreCase;
    private final IdentityHashMap<String, FieldInfo> nameToFieldInfoMap = new IdentityHashMap<>();
    final List<String> names;

    public static ClassInfo of(Class<?> cls) {
        return of(cls, false);
    }

    public static ClassInfo of(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, ClassInfo> concurrentMap = z ? CACHE_IGNORE_CASE : CACHE;
        ClassInfo classInfo = concurrentMap.get(cls);
        if (classInfo == null) {
            ClassInfo classInfo2 = new ClassInfo(cls, z);
            ClassInfo putIfAbsent = concurrentMap.putIfAbsent(cls, classInfo2);
            return putIfAbsent == null ? classInfo2 : putIfAbsent;
        }
        return classInfo;
    }

    public Class<?> getUnderlyingClass() {
        return this.clazz;
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public FieldInfo getFieldInfo(String str) {
        if (str != null) {
            if (this.ignoreCase) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.nameToFieldInfoMap.get(str);
    }

    public Field getField(String str) {
        FieldInfo fieldInfo = getFieldInfo(str);
        if (fieldInfo == null) {
            return null;
        }
        return fieldInfo.getField();
    }

    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    public Collection<String> getNames() {
        return this.names;
    }

    private ClassInfo(Class<?> cls, boolean z) {
        Field[] declaredFields;
        List<String> unmodifiableList;
        this.clazz = cls;
        this.ignoreCase = z;
        Preconditions.checkArgument((z && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: com.google.api.client.util.ClassInfo.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                if (Objects.equal(str, str2)) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field : cls.getDeclaredFields()) {
            FieldInfo of = FieldInfo.of(field);
            if (of != null) {
                String name = of.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                FieldInfo fieldInfo = this.nameToFieldInfoMap.get(name);
                boolean z2 = fieldInfo == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = name;
                objArr[2] = field;
                objArr[3] = fieldInfo == null ? null : fieldInfo.getField();
                Preconditions.checkArgument(z2, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.nameToFieldInfoMap.put(name, of);
                treeSet.add(name);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo of2 = of(superclass, z);
            treeSet.addAll(of2.names);
            for (Map.Entry<String, FieldInfo> entry : of2.nameToFieldInfoMap.entrySet()) {
                String key = entry.getKey();
                if (!this.nameToFieldInfoMap.containsKey(key)) {
                    this.nameToFieldInfoMap.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.names = unmodifiableList;
    }

    public Collection<FieldInfo> getFieldInfos() {
        return Collections.unmodifiableCollection(this.nameToFieldInfoMap.values());
    }
}
