package org.json;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes5.dex */
public class JSONObject {
    private final Map<String, Object> map;
    static final Pattern NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    public static final Object NULL = new Null();

    /* loaded from: classes5.dex */
    private static final class Null {
        protected final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return AbstractJsonLexerKt.NULL;
        }

        private Null() {
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public JSONObject(JSONObject jSONObject, String... strArr) {
        this(strArr.length);
        for (String str : strArr) {
            try {
                putOnce(str, jSONObject.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() != '{') {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            char previous = jSONTokener.getPrevious();
            char nextClean = jSONTokener.nextClean();
            if (nextClean == 0) {
                throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
            }
            if (nextClean == '[' || nextClean == '{') {
                if (previous == '{') {
                    throw jSONTokener.syntaxError("A JSON Object can not directly nest another JSON Object or JSON Array.");
                }
            } else if (nextClean == '}') {
                return;
            }
            jSONTokener.back();
            String obj = jSONTokener.nextValue().toString();
            if (jSONTokener.nextClean() != ':') {
                throw jSONTokener.syntaxError("Expected a ':' after a key");
            }
            if (obj != null) {
                if (opt(obj) != null) {
                    throw jSONTokener.syntaxError("Duplicate key \"" + obj + "\"");
                }
                Object nextValue = jSONTokener.nextValue();
                if (nextValue != null) {
                    put(obj, nextValue);
                }
            }
            char nextClean2 = jSONTokener.nextClean();
            if (nextClean2 != ',' && nextClean2 != ';') {
                if (nextClean2 != '}') {
                    throw jSONTokener.syntaxError("Expected a ',' or '}'");
                }
                return;
            } else if (jSONTokener.nextClean() == '}') {
                return;
            } else {
                jSONTokener.back();
            }
        }
    }

    public JSONObject(Map<?, ?> map) {
        if (map == null) {
            this.map = new HashMap();
            return;
        }
        this.map = new HashMap(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new NullPointerException("Null key.");
            }
            Object value = entry.getValue();
            if (value != null) {
                this.map.put(String.valueOf(entry.getKey()), wrap(value));
            }
        }
    }

    public JSONObject(Object obj) {
        this();
        populateMap(obj);
    }

    private JSONObject(Object obj, Set<Object> set) {
        this();
        populateMap(obj, set);
    }

    public JSONObject(Object obj, String... strArr) {
        this(strArr.length);
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            if (nextElement != null) {
                String str2 = nextElement;
                String[] split = str2.split("\\.");
                int length = split.length - 1;
                JSONObject jSONObject = this;
                for (int i = 0; i < length; i++) {
                    String str3 = split[i];
                    JSONObject optJSONObject = jSONObject.optJSONObject(str3);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(str3, optJSONObject);
                    }
                    jSONObject = optJSONObject;
                }
                jSONObject.put(split[length], bundle.getString(str2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject(int i) {
        this.map = new HashMap(i);
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            if (obj instanceof JSONArray) {
                obj = new JSONArray().put(obj);
            }
            put(str, obj);
        } else if (opt instanceof JSONArray) {
            ((JSONArray) opt).put(obj);
        } else {
            put(str, new JSONArray().put(opt).put(obj));
        }
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            put(str, new JSONArray().put(obj));
        } else if (opt instanceof JSONArray) {
            put(str, ((JSONArray) opt).put(obj));
        } else {
            throw wrongValueFormatException(str, "JSONArray", null, null);
        }
        return this;
    }

    public static String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return AbstractJsonLexerKt.NULL;
        }
        String d2 = Double.toString(d);
        if (d2.indexOf(46) <= 0 || d2.indexOf(101) >= 0 || d2.indexOf(69) >= 0) {
            return d2;
        }
        while (d2.endsWith("0")) {
            d2 = d2.substring(0, d2.length() - 1);
        }
        return d2.endsWith(".") ? d2.substring(0, d2.length() - 1) : d2;
    }

    public Object get(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        Object opt = opt(str);
        if (opt != null) {
            return opt;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not found.");
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) throws JSONException {
        E e = (E) optEnum(cls, str);
        if (e != null) {
            return e;
        }
        throw wrongValueFormatException(str, "enum of type " + quote(cls.getSimpleName()), null);
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z = obj instanceof String;
        if (z && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z && ((String) obj).equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return true;
        }
        throw wrongValueFormatException(str, "Boolean", null);
    }

    public BigInteger getBigInteger(String str) throws JSONException {
        Object obj = get(str);
        BigInteger objectToBigInteger = objectToBigInteger(obj, null);
        if (objectToBigInteger != null) {
            return objectToBigInteger;
        }
        throw wrongValueFormatException(str, "BigInteger", obj, null);
    }

    public BigDecimal getBigDecimal(String str) throws JSONException {
        Object obj = get(str);
        BigDecimal objectToBigDecimal = objectToBigDecimal(obj, null);
        if (objectToBigDecimal != null) {
            return objectToBigDecimal;
        }
        throw wrongValueFormatException(str, "BigDecimal", obj, null);
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "double", e);
        }
    }

    public float getFloat(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, TypedValues.Custom.S_FLOAT, e);
        }
    }

    public Number getNumber(String str) throws JSONException {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return (Number) obj;
            }
            return stringToNumber(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "number", e);
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "int", e);
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw wrongValueFormatException(str, "JSONArray", null);
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw wrongValueFormatException(str, "JSONObject", null);
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "long", e);
        }
    }

    public static String[] getNames(JSONObject jSONObject) {
        if (jSONObject.isEmpty()) {
            return null;
        }
        return (String[]) jSONObject.keySet().toArray(new String[jSONObject.length()]);
    }

    public static String[] getNames(Object obj) {
        Field[] fields;
        int length;
        if (obj == null || (length = (fields = obj.getClass().getFields()).length) == 0) {
            return null;
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = fields[i].getName();
        }
        return strArr;
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw wrongValueFormatException(str, TypedValues.Custom.S_STRING, null);
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public JSONObject increment(String str) throws JSONException {
        Object opt = opt(str);
        if (opt == null) {
            put(str, 1);
        } else if (opt instanceof Integer) {
            put(str, ((Integer) opt).intValue() + 1);
        } else if (opt instanceof Long) {
            put(str, ((Long) opt).longValue() + 1);
        } else if (opt instanceof BigInteger) {
            put(str, ((BigInteger) opt).add(BigInteger.ONE));
        } else if (opt instanceof Float) {
            put(str, ((Float) opt).floatValue() + 1.0f);
        } else if (opt instanceof Double) {
            put(str, ((Double) opt).doubleValue() + 1.0d);
        } else if (opt instanceof BigDecimal) {
            put(str, ((BigDecimal) opt).add(BigDecimal.ONE));
        } else {
            throw new JSONException("Unable to increment [" + quote(str) + "].");
        }
        return this;
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Iterator<String> keys() {
        return keySet().iterator();
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    protected Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public int length() {
        return this.map.size();
    }

    public void clear() {
        this.map.clear();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public JSONArray names() {
        if (this.map.isEmpty()) {
            return null;
        }
        return new JSONArray((Collection<?>) this.map.keySet());
    }

    public static String numberToString(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        testValidity(number);
        String obj = number.toString();
        if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
            return obj;
        }
        while (obj.endsWith("0")) {
            obj = obj.substring(0, obj.length() - 1);
        }
        return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str) {
        return (E) optEnum(cls, str, null);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str, E e) {
        try {
            Object opt = opt(str);
            if (NULL.equals(opt)) {
                return e;
            }
            if (cls.isAssignableFrom(opt.getClass())) {
                return (E) opt;
            }
            return (E) Enum.valueOf(cls, opt.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return e;
        }
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public boolean optBoolean(String str, boolean z) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return z;
        }
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public BigDecimal optBigDecimal(String str, BigDecimal bigDecimal) {
        return objectToBigDecimal(opt(str), bigDecimal);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigDecimal objectToBigDecimal(Object obj, BigDecimal bigDecimal) {
        return objectToBigDecimal(obj, bigDecimal, true);
    }

    static BigDecimal objectToBigDecimal(Object obj, BigDecimal bigDecimal, boolean z) {
        if (NULL.equals(obj)) {
            return bigDecimal;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            Number number = (Number) obj;
            if (numberIsFinite(number)) {
                if (z) {
                    return new BigDecimal(number.doubleValue());
                }
                return new BigDecimal(obj.toString());
            }
            return bigDecimal;
        } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return new BigDecimal(((Number) obj).longValue());
        } else {
            try {
                return new BigDecimal(obj.toString());
            } catch (Exception unused) {
                return bigDecimal;
            }
        }
    }

    public BigInteger optBigInteger(String str, BigInteger bigInteger) {
        return objectToBigInteger(opt(str), bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigInteger objectToBigInteger(Object obj, BigInteger bigInteger) {
        if (NULL.equals(obj)) {
            return bigInteger;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            Number number = (Number) obj;
            return !numberIsFinite(number) ? bigInteger : new BigDecimal(number.doubleValue()).toBigInteger();
        } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        } else {
            try {
                String obj2 = obj.toString();
                if (isDecimalNotation(obj2)) {
                    return new BigDecimal(obj2).toBigInteger();
                }
                return new BigInteger(obj2);
            } catch (Exception unused) {
                return bigInteger;
            }
        }
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public double optDouble(String str, double d) {
        Number optNumber = optNumber(str);
        return optNumber == null ? d : optNumber.doubleValue();
    }

    public float optFloat(String str) {
        return optFloat(str, Float.NaN);
    }

    public float optFloat(String str, float f) {
        Number optNumber = optNumber(str);
        return optNumber == null ? f : optNumber.floatValue();
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public int optInt(String str, int i) {
        Number optNumber = optNumber(str, null);
        return optNumber == null ? i : optNumber.intValue();
    }

    public JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        return optJSONObject(str, null);
    }

    public JSONObject optJSONObject(String str, JSONObject jSONObject) {
        Object opt = opt(str);
        return opt instanceof JSONObject ? (JSONObject) opt : jSONObject;
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public long optLong(String str, long j) {
        Number optNumber = optNumber(str, null);
        return optNumber == null ? j : optNumber.longValue();
    }

    public Number optNumber(String str) {
        return optNumber(str, null);
    }

    public Number optNumber(String str, Number number) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return number;
        }
        if (opt instanceof Number) {
            return (Number) opt;
        }
        try {
            return stringToNumber(opt.toString());
        } catch (Exception unused) {
            return number;
        }
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public String optString(String str, String str2) {
        Object opt = opt(str);
        return NULL.equals(opt) ? str2 : opt.toString();
    }

    private void populateMap(Object obj) {
        populateMap(obj, Collections.newSetFromMap(new IdentityHashMap()));
    }

    private void populateMap(Object obj, Set<Object> set) {
        Method[] methods;
        String keyNameFromMethod;
        Class<?> cls = obj.getClass();
        for (Method method : cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE && isValidMethodName(method.getName()) && (keyNameFromMethod = getKeyNameFromMethod(method)) != null && !keyNameFromMethod.isEmpty()) {
                try {
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (invoke != null) {
                        if (set.contains(invoke)) {
                            throw recursivelyDefinedObjectException(keyNameFromMethod);
                            break;
                        }
                        set.add(invoke);
                        this.map.put(keyNameFromMethod, wrap(invoke, set));
                        set.remove(invoke);
                        if (invoke instanceof Closeable) {
                            ((Closeable) invoke).close();
                        }
                    } else {
                        continue;
                    }
                } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    continue;
                }
            }
        }
    }

    private static boolean isValidMethodName(String str) {
        return ("getClass".equals(str) || "getDeclaringClass".equals(str)) ? false : true;
    }

    private static String getKeyNameFromMethod(Method method) {
        String substring;
        int annotationDepth;
        int annotationDepth2 = getAnnotationDepth(method, JSONPropertyIgnore.class);
        if (annotationDepth2 <= 0 || ((annotationDepth = getAnnotationDepth(method, JSONPropertyName.class)) >= 0 && annotationDepth2 > annotationDepth)) {
            JSONPropertyName jSONPropertyName = (JSONPropertyName) getAnnotation(method, JSONPropertyName.class);
            if (jSONPropertyName != null && jSONPropertyName.value() != null && !jSONPropertyName.value().isEmpty()) {
                return jSONPropertyName.value();
            }
            String name = method.getName();
            if (name.startsWith("get") && name.length() > 3) {
                substring = name.substring(3);
            } else {
                if (name.startsWith("is") && name.length() > 2) {
                    substring = name.substring(2);
                }
                return null;
            }
            if (substring.length() != 0 && !Character.isLowerCase(substring.charAt(0))) {
                if (substring.length() == 1) {
                    return substring.toLowerCase(Locale.ROOT);
                }
                if (Character.isUpperCase(substring.charAt(1))) {
                    return substring;
                }
                return substring.substring(0, 1).toLowerCase(Locale.ROOT) + substring.substring(1);
            }
            return null;
        }
        return null;
    }

    private static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) {
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return (A) method.getAnnotation(cls);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    return (A) getAnnotation(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                return (A) getAnnotation(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    private static int getAnnotationDepth(Method method, Class<? extends Annotation> cls) {
        int annotationDepth;
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    annotationDepth = getAnnotationDepth(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
                if (annotationDepth > 0) {
                    return annotationDepth + 1;
                }
            }
            try {
                int annotationDepth2 = getAnnotationDepth(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (annotationDepth2 > 0) {
                    return annotationDepth2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        return put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public JSONObject put(String str, Collection<?> collection) throws JSONException {
        return put(str, new JSONArray(collection));
    }

    public JSONObject put(String str, double d) throws JSONException {
        return put(str, Double.valueOf(d));
    }

    public JSONObject put(String str, float f) throws JSONException {
        return put(str, Float.valueOf(f));
    }

    public JSONObject put(String str, int i) throws JSONException {
        return put(str, Integer.valueOf(i));
    }

    public JSONObject put(String str, long j) throws JSONException {
        return put(str, Long.valueOf(j));
    }

    public JSONObject put(String str, Map<?, ?> map) throws JSONException {
        return put(str, new JSONObject(map));
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str != null) {
            if (obj != null) {
                testValidity(obj);
                this.map.put(str, obj);
            } else {
                remove(str);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return this;
        }
        if (opt(str) != null) {
            throw new JSONException("Duplicate key \"" + str + "\"");
        }
        return put(str, obj);
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        return (str == null || obj == null) ? this : put(str, obj);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object query(JSONPointer jSONPointer) {
        return jSONPointer.queryFrom(this);
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public Object optQuery(JSONPointer jSONPointer) {
        try {
            return jSONPointer.queryFrom(this);
        } catch (JSONPointerException unused) {
            return null;
        }
    }

    public static String quote(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    obj = quote(str, stringWriter).toString();
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static Writer quote(String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                writer.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c == '<') {
                            writer.write(92);
                        }
                        writer.write(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                writer.write("\\b");
                                continue;
                            case '\t':
                                writer.write("\\t");
                                continue;
                            case '\n':
                                writer.write("\\n");
                                continue;
                            default:
                                if (charAt < ' ' || ((charAt >= 128 && charAt < 160) || (charAt >= 8192 && charAt < 8448))) {
                                    writer.write("\\u");
                                    String hexString = Integer.toHexString(charAt);
                                    writer.write("0000", 0, 4 - hexString.length());
                                    writer.write(hexString);
                                    break;
                                } else {
                                    writer.write(charAt);
                                    continue;
                                }
                        }
                    }
                }
                writer.write(92);
                writer.write(charAt);
            } else {
                writer.write("\\r");
            }
            i++;
            c = charAt;
        }
        writer.write(34);
        return writer;
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public boolean similar(Object obj) {
        try {
            if ((obj instanceof JSONObject) && keySet().equals(((JSONObject) obj).keySet())) {
                for (Map.Entry<String, Object> entry : entrySet()) {
                    Object value = entry.getValue();
                    Object obj2 = ((JSONObject) obj).get(entry.getKey());
                    if (value != obj2) {
                        if (value == null) {
                            return false;
                        }
                        if (value instanceof JSONObject) {
                            if (!((JSONObject) value).similar(obj2)) {
                                return false;
                            }
                        } else if (value instanceof JSONArray) {
                            if (!((JSONArray) value).similar(obj2)) {
                                return false;
                            }
                        } else if ((value instanceof Number) && (obj2 instanceof Number)) {
                            if (!isNumberSimilar((Number) value, (Number) obj2)) {
                                return false;
                            }
                        } else if (!value.equals(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNumberSimilar(Number number, Number number2) {
        if (numberIsFinite(number) && numberIsFinite(number2)) {
            if (number.getClass().equals(number2.getClass()) && (number instanceof Comparable)) {
                return ((Comparable) number).compareTo(number2) == 0;
            }
            BigDecimal objectToBigDecimal = objectToBigDecimal(number, null, false);
            BigDecimal objectToBigDecimal2 = objectToBigDecimal(number2, null, false);
            return (objectToBigDecimal == null || objectToBigDecimal2 == null || objectToBigDecimal.compareTo(objectToBigDecimal2) != 0) ? false : true;
        }
        return false;
    }

    private static boolean numberIsFinite(Number number) {
        if (number instanceof Double) {
            Double d = (Double) number;
            if (d.isInfinite() || d.isNaN()) {
                return false;
            }
        }
        if (number instanceof Float) {
            Float f = (Float) number;
            return (f.isInfinite() || f.isNaN()) ? false : true;
        }
        return true;
    }

    protected static boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Number stringToNumber(String str) throws NumberFormatException {
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            if (isDecimalNotation(str)) {
                try {
                    try {
                        BigDecimal bigDecimal = new BigDecimal(str);
                        return (charAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? Double.valueOf(-0.0d) : bigDecimal;
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException("val [" + str + "] is not a valid number.");
                    }
                } catch (NumberFormatException unused2) {
                    Double valueOf = Double.valueOf(str);
                    if (valueOf.isNaN() || valueOf.isInfinite()) {
                        throw new NumberFormatException("val [" + str + "] is not a valid number.");
                    }
                    return valueOf;
                }
            }
            if (charAt == '0' && str.length() > 1) {
                char charAt2 = str.charAt(1);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } else if (charAt == '-' && str.length() > 2) {
                char charAt3 = str.charAt(1);
                char charAt4 = str.charAt(2);
                if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            }
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 31) {
                return Integer.valueOf(bigInteger.intValue());
            }
            return bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
        }
        throw new NumberFormatException("val [" + str + "] is not a valid number.");
    }

    public static Object stringToValue(String str) {
        if ("".equals(str)) {
            return str;
        }
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(str)) {
            return NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            return str;
        }
        try {
            return stringToNumber(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void testValidity(Object obj) throws JSONException {
        if ((obj instanceof Number) && !numberIsFinite((Number) obj)) {
            throw new JSONException("JSON does not allow non-finite numbers.");
        }
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(opt(jSONArray.getString(i)));
        }
        return jSONArray2;
    }

    public String toString() {
        try {
            return toString(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString(int i) throws JSONException {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = write(stringWriter, i, 0).toString();
        }
        return obj;
    }

    public static String valueToString(Object obj) throws JSONException {
        return JSONWriter.valueToString(obj);
    }

    public static Object wrap(Object obj) {
        return wrap(obj, null);
    }

    private static Object wrap(Object obj, Set<Object> set) {
        try {
            Object obj2 = NULL;
            if (obj2.equals(obj)) {
                return obj2;
            }
            if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && !obj2.equals(obj) && !(obj instanceof JSONString) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof BigInteger) && !(obj instanceof BigDecimal) && !(obj instanceof Enum)) {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection<?>) obj);
                }
                if (obj.getClass().isArray()) {
                    return new JSONArray(obj);
                }
                if (obj instanceof Map) {
                    return new JSONObject((Map<?, ?>) obj);
                }
                Package r0 = obj.getClass().getPackage();
                String name = r0 != null ? r0.getName() : "";
                if (!name.startsWith("java.") && !name.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                    if (set != null) {
                        return new JSONObject(obj, set);
                    }
                    return new JSONObject(obj);
                }
                return obj.toString();
            }
            return obj;
        } catch (JSONException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws JSONException {
        return write(writer, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Writer writeValue(Writer writer, Object obj, int i, int i2) throws JSONException, IOException {
        if (obj == null || obj.equals(null)) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                writer.write(jSONString != null ? jSONString.toString() : quote(obj.toString()));
            } catch (Exception e) {
                throw new JSONException(e);
            }
        } else if (obj instanceof Number) {
            String numberToString = numberToString((Number) obj);
            if (NUMBER_PATTERN.matcher(numberToString).matches()) {
                writer.write(numberToString);
            } else {
                quote(numberToString, writer);
            }
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof Enum) {
            writer.write(quote(((Enum) obj).name()));
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).write(writer, i, i2);
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).write(writer, i, i2);
        } else if (obj instanceof Map) {
            new JSONObject((Map<?, ?>) obj).write(writer, i, i2);
        } else if (obj instanceof Collection) {
            new JSONArray((Collection<?>) obj).write(writer, i, i2);
        } else if (obj.getClass().isArray()) {
            new JSONArray(obj).write(writer, i, i2);
        } else {
            quote(obj.toString(), writer);
        }
        return writer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void indent(Writer writer, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    public Writer write(Writer writer, int i, int i2) throws JSONException {
        try {
            int length = length();
            writer.write(123);
            if (length == 1) {
                Map.Entry<String, Object> next = entrySet().iterator().next();
                String key = next.getKey();
                writer.write(quote(key));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                try {
                    writeValue(writer, next.getValue(), i, i2);
                    writer.write(125);
                    return writer;
                } catch (Exception e) {
                    throw new JSONException("Unable to write JSONObject value for key: " + key, e);
                }
            }
            if (length != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry<String, Object> entry : entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    indent(writer, i3);
                    String key2 = entry.getKey();
                    writer.write(quote(key2));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    try {
                        writeValue(writer, entry.getValue(), i, i3);
                        z = true;
                    } catch (Exception e2) {
                        throw new JSONException("Unable to write JSONObject value for key: " + key2, e2);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                indent(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (IOException e3) {
            throw new JSONException(e3);
        }
    }

    public Map<String, Object> toMap() {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            if (entry.getValue() == null || NULL.equals(entry.getValue())) {
                obj = null;
            } else if (entry.getValue() instanceof JSONObject) {
                obj = ((JSONObject) entry.getValue()).toMap();
            } else if (entry.getValue() instanceof JSONArray) {
                obj = ((JSONArray) entry.getValue()).toList();
            } else {
                obj = entry.getValue();
            }
            hashMap.put(entry.getKey(), obj);
        }
        return hashMap;
    }

    private static JSONException wrongValueFormatException(String str, String str2, Throwable th) {
        return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + ".", th);
    }

    private static JSONException wrongValueFormatException(String str, String str2, Object obj, Throwable th) {
        return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + " (" + obj + ").", th);
    }

    private static JSONException recursivelyDefinedObjectException(String str) {
        return new JSONException("JavaBean object contains recursively defined member variable of key " + quote(str));
    }
}
