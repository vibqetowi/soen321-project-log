package org.apache.commons.lang3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.mutable.MutableObject;
/* loaded from: classes5.dex */
public class ClassUtils {
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    private static final Map<String, String> abbreviationMap;
    private static final Map<String, Class<?>> namePrimitiveMap;
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap;
    private static final Map<String, String> reverseAbbreviationMap;
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap;
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    public static final String PACKAGE_SEPARATOR = String.valueOf((char) PACKAGE_SEPARATOR_CHAR);
    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');

    /* loaded from: classes5.dex */
    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    private static boolean useFull(int i, int i2, int i3, int i4) {
        return i2 >= i3 || (i + i3) - i2 <= i4;
    }

    static {
        HashMap hashMap = new HashMap();
        namePrimitiveMap = hashMap;
        hashMap.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        hashMap.put("int", Integer.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("double", Double.TYPE);
        hashMap.put(TypedValues.Custom.S_FLOAT, Float.TYPE);
        hashMap.put("void", Void.TYPE);
        HashMap hashMap2 = new HashMap();
        primitiveWrapperMap = hashMap2;
        hashMap2.put(Boolean.TYPE, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(Integer.TYPE, Integer.class);
        hashMap2.put(Long.TYPE, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(Float.TYPE, Float.class);
        hashMap2.put(Void.TYPE, Void.TYPE);
        wrapperPrimitiveMap = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class<?> cls = (Class) entry.getKey();
            Class<?> cls2 = (Class) entry.getValue();
            if (!cls.equals(cls2)) {
                wrapperPrimitiveMap.put(cls2, cls);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("int", "I");
        hashMap3.put(TypedValues.Custom.S_BOOLEAN, "Z");
        hashMap3.put(TypedValues.Custom.S_FLOAT, "F");
        hashMap3.put("long", "J");
        hashMap3.put("short", ExifInterface.LATITUDE_SOUTH);
        hashMap3.put("byte", "B");
        hashMap3.put("double", "D");
        hashMap3.put("char", "C");
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            hashMap4.put(entry2.getValue(), entry2.getKey());
        }
        abbreviationMap = Collections.unmodifiableMap(hashMap3);
        reverseAbbreviationMap = Collections.unmodifiableMap(hashMap4);
    }

    public static String getShortClassName(Object obj, String str) {
        return obj == null ? str : getShortClassName(obj.getClass());
    }

    public static String getShortClassName(Class<?> cls) {
        return cls == null ? "" : getShortClassName(cls.getName());
    }

    public static String getShortClassName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = reverseAbbreviationMap;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', PACKAGE_SEPARATOR_CHAR);
        }
        return substring + ((Object) sb);
    }

    public static String getSimpleName(Class<?> cls) {
        return getSimpleName(cls, "");
    }

    public static String getSimpleName(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static String getSimpleName(Object obj) {
        return getSimpleName(obj, "");
    }

    public static String getSimpleName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static String getName(Class<?> cls) {
        return getName(cls, "");
    }

    public static String getName(Class<?> cls, String str) {
        return cls == null ? str : cls.getName();
    }

    public static String getName(Object obj) {
        return getName(obj, "");
    }

    public static String getName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String getPackageName(Object obj, String str) {
        return obj == null ? str : getPackageName(obj.getClass());
    }

    public static String getPackageName(Class<?> cls) {
        return cls == null ? "" : getPackageName(cls.getName());
    }

    public static String getPackageName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    public static String getAbbreviatedName(Class<?> cls, int i) {
        return cls == null ? "" : getAbbreviatedName(cls.getName(), i);
    }

    public static String getAbbreviatedName(String str, int i) {
        char c;
        if (i > 0) {
            if (str == null) {
                return "";
            }
            if (str.length() <= i) {
                return str;
            }
            char[] charArray = str.toCharArray();
            int i2 = 0;
            int i3 = 0;
            while (i2 < charArray.length) {
                int i4 = i3;
                while (i2 < charArray.length && (c = charArray[i2]) != '.') {
                    i2++;
                    charArray[i4] = c;
                    i4++;
                }
                int i5 = i3 + 1;
                if (!useFull(i4, i2, charArray.length, i) && i5 <= i4) {
                    i4 = i5;
                }
                if (i2 < charArray.length) {
                    i3 = i4 + 1;
                    charArray[i4] = charArray[i2];
                    i2++;
                } else {
                    i3 = i4;
                }
            }
            return new String(charArray, 0, i3);
        }
        throw new IllegalArgumentException("len must be > 0");
    }

    public static List<Class<?>> getAllSuperclasses(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getAllInterfaces(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    getAllInterfaces(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> convertClassNamesToClasses(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List<String> convertClassesToClassNames(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>... clsArr2) {
        return isAssignable(clsArr, clsArr2, true);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (ArrayUtils.isSameLength((Object[]) clsArr, (Object[]) clsArr2)) {
            if (clsArr == null) {
                clsArr = ArrayUtils.EMPTY_CLASS_ARRAY;
            }
            if (clsArr2 == null) {
                clsArr2 = ArrayUtils.EMPTY_CLASS_ARRAY;
            }
            for (int i = 0; i < clsArr.length; i++) {
                if (!isAssignable(clsArr[i], clsArr2[i], z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isPrimitiveOrWrapper(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || isPrimitiveWrapper(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        return wrapperPrimitiveMap.containsKey(cls);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        return isAssignable(cls, cls2, true);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = primitiveToWrapper(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = wrapperToPrimitive(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                if (Integer.TYPE.equals(cls)) {
                    return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                } else if (Long.TYPE.equals(cls)) {
                    return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                    return false;
                } else {
                    if (Float.TYPE.equals(cls)) {
                        return Double.TYPE.equals(cls2);
                    }
                    if (Character.TYPE.equals(cls)) {
                        return Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                    } else if (Short.TYPE.equals(cls)) {
                        return Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                    } else if (Byte.TYPE.equals(cls)) {
                        return Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Class<?> primitiveToWrapper(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : primitiveWrapperMap.get(cls);
    }

    public static Class<?>[] primitivesToWrappers(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = primitiveToWrapper(clsArr[i]);
        }
        return clsArr2;
    }

    public static Class<?> wrapperToPrimitive(Class<?> cls) {
        return wrapperPrimitiveMap.get(cls);
    }

    public static Class<?>[] wrappersToPrimitives(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = wrapperToPrimitive(clsArr[i]);
        }
        return clsArr2;
    }

    public static boolean isInnerClass(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static Class<?> getClass(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        try {
            Map<String, Class<?>> map = namePrimitiveMap;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return Class.forName(toCanonicalName(str), z, classLoader);
        } catch (ClassNotFoundException e) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return getClass(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    public static Class<?> getClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return getClass(classLoader, str, true);
    }

    public static Class<?> getClass(String str) throws ClassNotFoundException {
        return getClass(str, true);
    }

    public static Class<?> getClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassUtils.class.getClassLoader();
        }
        return getClass(contextClassLoader, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        Method method2 = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
            return method2;
        }
        ArrayList<Class> arrayList = new ArrayList();
        arrayList.addAll(getAllInterfaces(cls));
        arrayList.addAll(getAllSuperclasses(cls));
        for (Class cls2 : arrayList) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    method = cls2.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
                if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                    return method;
                }
            }
            while (r2.hasNext()) {
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + " " + ArrayUtils.toString(clsArr));
    }

    private static String toCanonicalName(String str) {
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        Validate.notNull(deleteWhitespace, "className must not be null.", new Object[0]);
        if (deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            StringBuilder sb = new StringBuilder();
            while (deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                deleteWhitespace = deleteWhitespace.substring(0, deleteWhitespace.length() - 2);
                sb.append("[");
            }
            String str2 = abbreviationMap.get(deleteWhitespace);
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("L");
                sb.append(deleteWhitespace);
                sb.append(";");
            }
            return sb.toString();
        }
        return deleteWhitespace;
    }

    public static Class<?>[] toClass(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }

    public static String getShortCanonicalName(Object obj, String str) {
        return obj == null ? str : getShortCanonicalName(obj.getClass().getName());
    }

    public static String getCanonicalName(Class<?> cls) {
        return getCanonicalName(cls, "");
    }

    public static String getCanonicalName(Class<?> cls, String str) {
        String canonicalName;
        return (cls == null || (canonicalName = cls.getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getCanonicalName(Object obj) {
        return getCanonicalName(obj, "");
    }

    public static String getCanonicalName(Object obj, String str) {
        String canonicalName;
        return (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getShortCanonicalName(Class<?> cls) {
        return cls == null ? "" : getShortCanonicalName(cls.getName());
    }

    public static String getShortCanonicalName(String str) {
        return getShortClassName(getCanonicalName(str));
    }

    public static String getPackageCanonicalName(Object obj, String str) {
        return obj == null ? str : getPackageCanonicalName(obj.getClass().getName());
    }

    public static String getPackageCanonicalName(Class<?> cls) {
        return cls == null ? "" : getPackageCanonicalName(cls.getName());
    }

    public static String getPackageCanonicalName(String str) {
        return getPackageName(getCanonicalName(str));
    }

    private static String getCanonicalName(String str) {
        int length;
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        if (deleteWhitespace == null) {
            return null;
        }
        int i = 0;
        while (deleteWhitespace.startsWith("[")) {
            i++;
            deleteWhitespace = deleteWhitespace.substring(1);
        }
        if (i < 1) {
            return deleteWhitespace;
        }
        if (deleteWhitespace.startsWith("L")) {
            if (deleteWhitespace.endsWith(";")) {
                length = deleteWhitespace.length() - 1;
            } else {
                length = deleteWhitespace.length();
            }
            deleteWhitespace = deleteWhitespace.substring(1, length);
        } else if (!deleteWhitespace.isEmpty()) {
            deleteWhitespace = reverseAbbreviationMap.get(deleteWhitespace.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(deleteWhitespace);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb.toString();
    }

    public static Iterable<Class<?>> hierarchy(Class<?> cls) {
        return hierarchy(cls, Interfaces.EXCLUDE);
    }

    public static Iterable<Class<?>> hierarchy(final Class<?> cls, Interfaces interfaces) {
        final Iterable<Class<?>> iterable = new Iterable() { // from class: org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return ClassUtils.lambda$hierarchy$0(cls);
            }
        };
        return interfaces != Interfaces.INCLUDE ? iterable : new Iterable() { // from class: org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return ClassUtils.lambda$hierarchy$1(iterable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterator lambda$hierarchy$0(Class cls) {
        final MutableObject mutableObject = new MutableObject(cls);
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return MutableObject.this.getValue() != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                Class<?> cls2 = (Class) MutableObject.this.getValue();
                MutableObject.this.setValue(cls2.getSuperclass());
                return cls2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterator lambda$hierarchy$1(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final Iterator it = iterable.iterator();
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.2
            Iterator interfaces = Collections.emptySet().iterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.interfaces.hasNext() || it.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                if (this.interfaces.hasNext()) {
                    Class<?> cls = (Class) this.interfaces.next();
                    hashSet.add(cls);
                    return cls;
                }
                Class<?> cls2 = (Class) it.next();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                walkInterfaces(linkedHashSet, cls2);
                this.interfaces = linkedHashSet.iterator();
                return cls2;
            }

            private void walkInterfaces(Set<Class<?>> set, Class<?> cls) {
                Class<?>[] interfaces;
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!hashSet.contains(cls2)) {
                        set.add(cls2);
                    }
                    walkInterfaces(set, cls2);
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
