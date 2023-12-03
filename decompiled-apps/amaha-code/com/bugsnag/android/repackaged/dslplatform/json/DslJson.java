package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import j$.util.Iterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import org.w3c.dom.Element;
/* loaded from: classes.dex */
public class DslJson<TContext> implements UnknownSerializer, TypeLookup {
    private final JsonWriter.WriteObject NULL_WRITER;
    private final JsonWriter.WriteObject OBJECT_ARRAY_WRITER;
    private final JsonWriter.WriteObject<JsonObject> OBJECT_WRITER;
    public final boolean allowArrayFormat;
    protected final List<ConverterFactory<JsonReader.BindObject>> binderFactories;
    private final ConcurrentMap<Type, JsonReader.BindObject> binders;
    public final TContext context;
    private final Map<Class<? extends Annotation>, Boolean> creatorMarkers;
    private final Map<Type, Object> defaults;
    private final JsonReader.DoublePrecision doublePrecision;
    private final JsonReader.ErrorInfo errorInfo;
    private final ExternalConverterAnalyzer externalConverterAnalyzer;
    protected final Fallback<TContext> fallback;
    protected final StringCache keyCache;
    protected final ThreadLocal<JsonReader> localReader;
    protected final ThreadLocal<JsonWriter> localWriter;
    private final int maxNumberDigits;
    private final int maxStringSize;
    private final ConcurrentMap<Class<?>, JsonReader.ReadJsonObject<JsonObject>> objectReaders;
    public final boolean omitDefaults;
    protected final List<ConverterFactory<JsonReader.ReadObject>> readerFactories;
    private final ConcurrentMap<Type, JsonReader.ReadObject> readers;
    private final int settingsBinders;
    private final int settingsReaders;
    private final int settingsWriters;
    private final JsonReader.UnknownNumberParsing unknownNumbers;
    protected final StringCache valuesCache;
    protected final List<ConverterFactory<JsonWriter.WriteObject>> writerFactories;
    private final ConcurrentMap<Class<?>, Class<?>> writerMap;
    private final ConcurrentMap<Type, JsonWriter.WriteObject> writers;
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private static final Object unknownValue = new Object();
    private static final Iterator EMPTY_ITERATOR = new AnonymousClass4();
    private static final JsonWriter.WriteObject CHAR_ARRAY_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.8
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Object obj) {
            StringConverter.serialize(new String((char[]) obj), jsonWriter);
        }
    };
    private static final byte[] NULL = {110, 117, 108, 108};

    /* loaded from: classes.dex */
    public interface ConverterFactory<T> {
        T tryCreate(Type type, DslJson dslJson);
    }

    /* loaded from: classes.dex */
    public interface Fallback<TContext> {
        Object deserialize(TContext tcontext, Type type, InputStream inputStream);

        Object deserialize(TContext tcontext, Type type, byte[] bArr, int i6);

        void serialize(Object obj, OutputStream outputStream);
    }

    /* loaded from: classes.dex */
    public static class Settings<TContext> {
        private boolean allowArrayFormat;
        private TContext context;
        private Fallback<TContext> fallback;
        private int fromServiceLoader;
        private boolean javaSpecifics;
        private boolean omitDefaults;
        private StringCache valuesCache;
        private StringCache keyCache = new SimpleStringCache();
        private JsonReader.ErrorInfo errorInfo = JsonReader.ErrorInfo.WITH_STACK_TRACE;
        private JsonReader.DoublePrecision doublePrecision = JsonReader.DoublePrecision.DEFAULT;
        private JsonReader.UnknownNumberParsing unknownNumbers = JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL;
        private int maxNumberDigits = 512;
        private int maxStringBuffer = 134217728;
        private final List<Configuration> configurations = new ArrayList();
        private final List<ConverterFactory<JsonWriter.WriteObject>> writerFactories = new ArrayList();
        private final List<ConverterFactory<JsonReader.ReadObject>> readerFactories = new ArrayList();
        private final List<ConverterFactory<JsonReader.BindObject>> binderFactories = new ArrayList();
        private final Set<ClassLoader> classLoaders = new HashSet();
        private final Map<Class<? extends Annotation>, Boolean> creatorMarkers = new HashMap();

        public Settings<TContext> allowArrayFormat(boolean z10) {
            this.allowArrayFormat = z10;
            return this;
        }

        public Settings<TContext> creatorMarker(Class<? extends Annotation> cls, boolean z10) {
            if (cls != null) {
                this.creatorMarkers.put(cls, Boolean.valueOf(z10));
                return this;
            }
            throw new IllegalArgumentException("marker can't be null");
        }

        public Settings<TContext> doublePrecision(JsonReader.DoublePrecision doublePrecision) {
            if (doublePrecision != null) {
                this.doublePrecision = doublePrecision;
                return this;
            }
            throw new IllegalArgumentException("precision can't be null");
        }

        public Settings<TContext> errorInfo(JsonReader.ErrorInfo errorInfo) {
            if (errorInfo != null) {
                this.errorInfo = errorInfo;
                return this;
            }
            throw new IllegalArgumentException("errorInfo can't be null");
        }

        @Deprecated
        public Settings<TContext> fallbackTo(Fallback<TContext> fallback) {
            this.fallback = fallback;
            return this;
        }

        public Settings<TContext> includeServiceLoader() {
            return includeServiceLoader(Thread.currentThread().getContextClassLoader());
        }

        public Settings<TContext> limitDigitsBuffer(int i6) {
            if (i6 >= 1) {
                this.maxNumberDigits = i6;
                return this;
            }
            throw new IllegalArgumentException("size can't be smaller than 1");
        }

        public Settings<TContext> limitStringBuffer(int i6) {
            if (i6 >= 1) {
                this.maxStringBuffer = i6;
                return this;
            }
            throw new IllegalArgumentException("size can't be smaller than 1");
        }

        public Settings<TContext> resolveBinder(ConverterFactory<? extends JsonReader.BindObject> converterFactory) {
            if (converterFactory != null) {
                if (!this.binderFactories.contains(converterFactory)) {
                    this.binderFactories.add(converterFactory);
                    return this;
                }
                throw new IllegalArgumentException("binder already registered");
            }
            throw new IllegalArgumentException("binder can't be null");
        }

        public Settings<TContext> resolveReader(ConverterFactory<? extends JsonReader.ReadObject> converterFactory) {
            if (converterFactory != null) {
                if (!this.readerFactories.contains(converterFactory)) {
                    this.readerFactories.add(converterFactory);
                    return this;
                }
                throw new IllegalArgumentException("reader already registered");
            }
            throw new IllegalArgumentException("reader can't be null");
        }

        public Settings<TContext> resolveWriter(ConverterFactory<? extends JsonWriter.WriteObject> converterFactory) {
            if (converterFactory != null) {
                if (!this.writerFactories.contains(converterFactory)) {
                    this.writerFactories.add(converterFactory);
                    return this;
                }
                throw new IllegalArgumentException("writer already registered");
            }
            throw new IllegalArgumentException("writer can't be null");
        }

        public Settings<TContext> skipDefaultValues(boolean z10) {
            this.omitDefaults = z10;
            return this;
        }

        public Settings<TContext> unknownNumbers(JsonReader.UnknownNumberParsing unknownNumberParsing) {
            if (unknownNumberParsing != null) {
                this.unknownNumbers = unknownNumberParsing;
                return this;
            }
            throw new IllegalArgumentException("unknownNumbers can't be null");
        }

        public Settings<TContext> useKeyCache(StringCache stringCache) {
            this.keyCache = stringCache;
            return this;
        }

        public Settings<TContext> useStringValuesCache(StringCache stringCache) {
            this.valuesCache = stringCache;
            return this;
        }

        public Settings<TContext> with(Configuration configuration) {
            if (configuration != null) {
                this.configurations.add(configuration);
                return this;
            }
            throw new IllegalArgumentException("conf can't be null");
        }

        public Settings<TContext> withContext(TContext tcontext) {
            this.context = tcontext;
            return this;
        }

        public Settings<TContext> withJavaConverters(boolean z10) {
            this.javaSpecifics = z10;
            return this;
        }

        public Settings<TContext> includeServiceLoader(ClassLoader classLoader) {
            boolean z10;
            if (classLoader != null) {
                this.classLoaders.add(classLoader);
                Iterator it = ServiceLoader.load(Configuration.class, classLoader).iterator();
                while (it.hasNext()) {
                    Configuration configuration = (Configuration) it.next();
                    Class<?> cls = configuration.getClass();
                    Iterator<Configuration> it2 = this.configurations.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        } else if (it2.next().getClass() == cls) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        this.fromServiceLoader++;
                        this.configurations.add(configuration);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("loader can't be null");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Settings<TContext> with(Iterable<Configuration> iterable) {
            if (iterable != null) {
                for (Configuration configuration : iterable) {
                    this.configurations.add(configuration);
                }
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class SimpleStringCache implements StringCache {
        private final String[] cache;
        private final int mask;

        public SimpleStringCache() {
            this(10);
        }

        private String createAndPut(int i6, char[] cArr, int i10) {
            String str = new String(cArr, 0, i10);
            this.cache[i6] = str;
            return str;
        }

        @Override // com.bugsnag.android.repackaged.dslplatform.json.StringCache
        public String get(char[] cArr, int i6) {
            long j10 = -2128831035;
            for (int i10 = 0; i10 < i6; i10++) {
                j10 = (j10 ^ ((byte) cArr[i10])) * 16777619;
            }
            int i11 = this.mask & ((int) j10);
            String str = this.cache[i11];
            if (str == null) {
                return createAndPut(i11, cArr, i6);
            }
            if (str.length() != i6) {
                return createAndPut(i11, cArr, i6);
            }
            for (int i12 = 0; i12 < str.length(); i12++) {
                if (str.charAt(i12) != cArr[i12]) {
                    return createAndPut(i11, cArr, i6);
                }
            }
            return str;
        }

        public SimpleStringCache(int i6) {
            int i10 = 2;
            for (int i11 = 1; i11 < i6; i11++) {
                i10 *= 2;
            }
            this.mask = i10 - 1;
            this.cache = new String[i10];
        }
    }

    public DslJson() {
        this(new Settings().includeServiceLoader());
    }

    private <T> void checkExternal(Type type, ConcurrentMap<Type, T> concurrentMap) {
        Type[] actualTypeArguments;
        Type extractActualType;
        if (type instanceof Class) {
            this.externalConverterAnalyzer.tryFindConverter((Class) type, this);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.externalConverterAnalyzer.tryFindConverter((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (extractActualType = extractActualType(type2)) != type2 && !concurrentMap.containsKey(extractActualType)) {
                    checkExternal(extractActualType, concurrentMap);
                }
            }
        }
    }

    private static Object convertResultToArray(Class<?> cls, List<?> list) {
        int i6 = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[list.size()];
                while (i6 < list.size()) {
                    zArr[i6] = ((Boolean) list.get(i6)).booleanValue();
                    i6++;
                }
                return zArr;
            } else if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[list.size()];
                while (i6 < list.size()) {
                    iArr[i6] = ((Integer) list.get(i6)).intValue();
                    i6++;
                }
                return iArr;
            } else if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[list.size()];
                while (i6 < list.size()) {
                    jArr[i6] = ((Long) list.get(i6)).longValue();
                    i6++;
                }
                return jArr;
            } else if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[list.size()];
                while (i6 < list.size()) {
                    sArr[i6] = ((Short) list.get(i6)).shortValue();
                    i6++;
                }
                return sArr;
            } else if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[list.size()];
                while (i6 < list.size()) {
                    bArr[i6] = ((Byte) list.get(i6)).byteValue();
                    i6++;
                }
                return bArr;
            } else if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[list.size()];
                while (i6 < list.size()) {
                    fArr[i6] = ((Float) list.get(i6)).floatValue();
                    i6++;
                }
                return fArr;
            } else if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[list.size()];
                while (i6 < list.size()) {
                    dArr[i6] = ((Double) list.get(i6)).doubleValue();
                    i6++;
                }
                return dArr;
            } else if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[list.size()];
                while (i6 < list.size()) {
                    cArr[i6] = ((Character) list.get(i6)).charValue();
                    i6++;
                }
                return cArr;
            }
        }
        return list.toArray((Object[]) Array.newInstance(cls, 0));
    }

    private <T extends JsonObject> JsonReader.ReadObject<T> convertToReader(final JsonReader.ReadJsonObject<T> readJsonObject) {
        return (JsonReader.ReadObject<T>) new JsonReader.ReadObject<T>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.6
            /* JADX WARN: Incorrect return type in method signature: (Lcom/bugsnag/android/repackaged/dslplatform/json/JsonReader;)TT; */
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
            public JsonObject read(JsonReader jsonReader) {
                if (jsonReader.wasNull()) {
                    return null;
                }
                if (jsonReader.last() == 123) {
                    jsonReader.getNextToken();
                    return readJsonObject.deserialize(jsonReader);
                }
                throw jsonReader.newParseError("Expecting '{' for object start");
            }
        };
    }

    @Deprecated
    public static ArrayList<Object> deserializeList(JsonReader jsonReader) {
        return ObjectConverter.deserializeList(jsonReader);
    }

    @Deprecated
    public static LinkedHashMap<String, Object> deserializeMap(JsonReader jsonReader) {
        return ObjectConverter.deserializeMap(jsonReader);
    }

    @Deprecated
    public static Object deserializeObject(JsonReader jsonReader) {
        return ObjectConverter.deserializeObject(jsonReader);
    }

    private static Type extractActualType(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) {
                return wildcardType.getUpperBounds()[0];
            }
            return type;
        }
        return type;
    }

    private static void findAllSignatures(Class<?> cls, ArrayList<Class<?>> arrayList) {
        if (arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            findAllSignatures(superclass, arrayList);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            findAllSignatures(cls2, arrayList);
        }
    }

    private JsonWriter.WriteObject getOrCreateWriter(Object obj, Class<?> cls) {
        Class cls2;
        if (obj instanceof JsonObject) {
            return this.OBJECT_WRITER;
        }
        if (obj instanceof JsonObject[]) {
            return this.OBJECT_ARRAY_WRITER;
        }
        if (cls != null) {
            cls2 = cls;
        } else {
            cls2 = obj.getClass();
        }
        if (cls != null && JsonObject.class.isAssignableFrom(cls2)) {
            return this.OBJECT_WRITER;
        }
        JsonWriter.WriteObject<T> tryFindWriter = tryFindWriter(cls2);
        if (tryFindWriter != 0) {
            return tryFindWriter;
        }
        if (cls2.isArray()) {
            Class componentType = cls2.getComponentType();
            if (Character.TYPE == componentType) {
                return CHAR_ARRAY_WRITER;
            }
            final JsonWriter.WriteObject<T> tryFindWriter2 = tryFindWriter(componentType);
            if (tryFindWriter2 != 0) {
                return new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.10
                    @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
                    public void write(JsonWriter jsonWriter, Object obj2) {
                        jsonWriter.serialize((Object[]) obj2, tryFindWriter2);
                    }
                };
            }
        }
        if (!(obj instanceof Collection) && !Collection.class.isAssignableFrom(cls2)) {
            throw new ConfigurationException(b.l("Unable to serialize provided object. Failed to find serializer for: ", cls2));
        }
        return new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.11
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, Object obj2) {
                Class<?> cls3;
                Collection collection = (Collection) obj2;
                Iterator it = collection.iterator();
                Class<?> cls4 = null;
                do {
                    Object next = it.next();
                    if (next != null && (cls3 = next.getClass()) != cls4 && (cls4 == null || cls3.isAssignableFrom(cls4))) {
                        cls4 = cls3;
                    }
                } while (it.hasNext());
                if (cls4 == null) {
                    jsonWriter.writeByte(JsonWriter.ARRAY_START);
                    jsonWriter.writeNull();
                    for (int i6 = 1; i6 < collection.size(); i6++) {
                        jsonWriter.writeAscii(",null");
                    }
                    jsonWriter.writeByte(JsonWriter.ARRAY_END);
                } else if (JsonObject.class.isAssignableFrom(cls4)) {
                    DslJson.this.serialize(jsonWriter, collection);
                } else {
                    JsonWriter.WriteObject tryFindWriter3 = DslJson.this.tryFindWriter((Class) cls4);
                    if (tryFindWriter3 != null) {
                        jsonWriter.serialize(collection, tryFindWriter3);
                    } else if (DslJson.this.fallback != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.reset();
                        try {
                            DslJson.this.fallback.serialize(obj2, byteArrayOutputStream);
                            jsonWriter.writeAscii(byteArrayOutputStream.toByteArray());
                        } catch (IOException e10) {
                            throw new SerializationException(e10);
                        }
                    } else {
                        throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + collection.getClass());
                    }
                }
            }
        };
    }

    private static void loadDefaultConverters(DslJson dslJson, Set<ClassLoader> set, String str) {
        for (ClassLoader classLoader : set) {
            try {
                ((Configuration) classLoader.loadClass(str).newInstance()).configure(dslJson);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    private <T> T lookupFromFactories(Type type, Type type2, List<ConverterFactory<T>> list, ConcurrentMap<Type, T> concurrentMap) {
        if (type2 instanceof Class) {
            this.externalConverterAnalyzer.tryFindConverter((Class) type2, this);
            T t3 = concurrentMap.get(type2);
            if (t3 != null) {
                return t3;
            }
        } else if (type2 instanceof ParameterizedType) {
            checkExternal(type2, concurrentMap);
        }
        for (ConverterFactory<T> converterFactory : list) {
            T tryCreate = converterFactory.tryCreate(type2, this);
            if (tryCreate != null) {
                concurrentMap.putIfAbsent(type, tryCreate);
                return tryCreate;
            }
        }
        return null;
    }

    private JsonReader.ReadJsonObject<JsonObject> probeForObjectReader(Class<?> cls, Object obj) {
        Object invoke;
        try {
            invoke = cls.getField("JSON_READER").get(obj);
        } catch (Exception unused) {
            try {
                try {
                    invoke = cls.getMethod("JSON_READER", new Class[0]).invoke(obj, new Object[0]);
                } catch (Exception unused2) {
                    return null;
                }
            } catch (Exception unused3) {
                invoke = cls.getMethod("getJSON_READER", new Class[0]).invoke(obj, new Object[0]);
            }
        }
        if (!(invoke instanceof JsonReader.ReadJsonObject)) {
            return null;
        }
        return (JsonReader.ReadJsonObject) invoke;
    }

    public static void registerJavaSpecifics(DslJson dslJson) {
        dslJson.registerReader(Element.class, (JsonReader.ReadObject) XmlConverter.Reader);
        dslJson.registerWriter(Element.class, (JsonWriter.WriteObject) XmlConverter.Writer);
    }

    private static Object returnAsArray(Type type, ArrayList<?> arrayList) {
        if (type instanceof Class) {
            return convertResultToArray((Class) type, arrayList);
        }
        if (type instanceof ParameterizedType) {
            return arrayList.toArray((Object[]) Array.newInstance((Class) ((ParameterizedType) type).getRawType(), 0));
        }
        return arrayList.toArray();
    }

    private static Object returnEmptyArray(Type type) {
        if (type instanceof Class) {
            return Array.newInstance((Class) type, 0);
        }
        if (type instanceof ParameterizedType) {
            return Array.newInstance((Class) ((ParameterizedType) type).getRawType(), 0);
        }
        return new Object[0];
    }

    public final boolean canDeserialize(Type type) {
        if (tryFindReader(type) != null) {
            return true;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                if (!cls.getComponentType().isArray() && !Collection.class.isAssignableFrom(cls.getComponentType()) && canDeserialize(cls.getComponentType())) {
                    return true;
                }
                return false;
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Class cls2 = (Class) parameterizedType.getRawType();
                if ((cls2.isArray() || Collection.class.isAssignableFrom(cls2)) && tryFindReader(parameterizedType.getActualTypeArguments()[0]) != null) {
                    return true;
                }
            }
        } else if ((type instanceof GenericArrayType) && tryFindReader(((GenericArrayType) type).getGenericComponentType()) != null) {
            return true;
        } else {
            return false;
        }
        return false;
    }

    public final boolean canSerialize(Type type) {
        if (this.writers.get(type) != null) {
            return true;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (JsonObject.class.isAssignableFrom(cls) || JsonObject[].class.isAssignableFrom(cls) || tryFindWriter(type) != null) {
                return true;
            }
            if (cls.isArray()) {
                if (!cls.getComponentType().isArray() && !Collection.class.isAssignableFrom(cls.getComponentType()) && canSerialize(cls.getComponentType())) {
                    return true;
                }
                return false;
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Class cls2 = (Class) parameterizedType.getRawType();
                if (cls2.isArray() || Collection.class.isAssignableFrom(cls2)) {
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    if (((type2 instanceof Class) && JsonObject.class.isAssignableFrom((Class) type2)) || tryFindWriter(type2) != null) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type;
            if (((genericArrayType.getGenericComponentType() instanceof Class) && JsonObject.class.isAssignableFrom((Class) genericArrayType.getGenericComponentType())) || tryFindWriter(genericArrayType.getGenericComponentType()) != null) {
                return true;
            }
            return false;
        }
        for (ConverterFactory<JsonWriter.WriteObject> converterFactory : this.writerFactories) {
            if (converterFactory.tryCreate(type, this) != null) {
                return true;
            }
        }
        return false;
    }

    public IOException createErrorMessage(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        findAllSignatures(cls, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (this.readers.containsKey(cls2)) {
                if (cls2.equals(cls)) {
                    return new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                }
                return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls2 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + getClass());
            }
        }
        return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
    }

    public <T> T deserialize(JsonReader.ReadObject<T> readObject, JsonReader<TContext> jsonReader) {
        if (readObject != null) {
            if (jsonReader != null) {
                jsonReader.getNextToken();
                return readObject.read(jsonReader);
            }
            throw new IllegalArgumentException("input can't be null");
        }
        throw new IllegalArgumentException("converter can't be null");
    }

    public Object deserializeWith(Type type, JsonReader jsonReader) {
        JsonReader.ReadObject<?> tryFindReader = tryFindReader(type);
        if (tryFindReader != null) {
            return tryFindReader.read(jsonReader);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                Class cls = (Class) parameterizedType.getRawType();
                if (cls.isArray() || Collection.class.isAssignableFrom(cls)) {
                    if (jsonReader.wasNull()) {
                        return null;
                    }
                    if (jsonReader.last() == 91) {
                        if (jsonReader.getNextToken() == 93) {
                            if (cls.isArray()) {
                                returnEmptyArray(type2);
                            }
                            return new ArrayList(0);
                        }
                        JsonReader.ReadObject<?> tryFindReader2 = tryFindReader(type2);
                        if (tryFindReader2 != null) {
                            ArrayList deserializeNullableCollection = jsonReader.deserializeNullableCollection(tryFindReader2);
                            if (cls.isArray()) {
                                return returnAsArray(type2, deserializeNullableCollection);
                            }
                            return deserializeNullableCollection;
                        }
                    } else {
                        throw jsonReader.newParseError("Expecting '[' for array start");
                    }
                }
            }
        } else if (type instanceof GenericArrayType) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                if (jsonReader.getNextToken() == 93) {
                    return returnEmptyArray(genericComponentType);
                }
                JsonReader.ReadObject<?> tryFindReader3 = tryFindReader(genericComponentType);
                if (tryFindReader3 != null) {
                    return returnAsArray(genericComponentType, jsonReader.deserializeNullableCollection(tryFindReader3));
                }
            } else {
                throw jsonReader.newParseError("Expecting '[' for array start");
            }
        }
        return unknownValue;
    }

    public final Object getDefault(Type type) {
        Class cls;
        if (type == null) {
            return null;
        }
        Object obj = this.defaults.get(type);
        if (obj != null) {
            return obj;
        }
        if (type instanceof Class) {
            cls = (Class) type;
        } else if (!(type instanceof ParameterizedType)) {
            return null;
        } else {
            cls = (Class) ((ParameterizedType) type).getRawType();
        }
        if (cls.isPrimitive()) {
            return Array.get(Array.newInstance(cls, 1), 0);
        }
        return this.defaults.get(cls);
    }

    public final JsonReader.ReadJsonObject<JsonObject> getObjectReader(Class<?> cls) {
        try {
            JsonReader.ReadJsonObject<JsonObject> readJsonObject = this.objectReaders.get(cls);
            if (readJsonObject == null) {
                readJsonObject = probeForObjectReader(cls, null);
                if (readJsonObject == null) {
                    try {
                        Object obj = cls.getField("Companion").get(null);
                        readJsonObject = probeForObjectReader(obj.getClass(), obj);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (readJsonObject != null) {
                    this.objectReaders.putIfAbsent(cls, readJsonObject);
                }
            }
            return readJsonObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Set<Type> getRegisteredBinders() {
        return this.binders.keySet();
    }

    public final Map<Class<? extends Annotation>, Boolean> getRegisteredCreatorMarkers() {
        return this.creatorMarkers;
    }

    public final Set<Type> getRegisteredDecoders() {
        return this.readers.keySet();
    }

    public final Set<Type> getRegisteredEncoders() {
        return this.writers.keySet();
    }

    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, InputStream inputStream) {
        if (cls != null) {
            if (inputStream != null) {
                JsonReader jsonReader = this.localReader.get();
                jsonReader.process(inputStream);
                return iterateOver(cls, jsonReader, inputStream);
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public JsonReader<TContext> newReader() {
        return new JsonReader<>(new byte[4096], 4096, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonWriter newWriter() {
        return new JsonWriter(this);
    }

    public <T, S extends T> void registerBinder(Class<T> cls, JsonReader.BindObject<S> bindObject) {
        if (bindObject == null) {
            this.binders.remove(cls);
        } else {
            this.binders.put(cls, bindObject);
        }
    }

    public boolean registerBinderFactory(ConverterFactory<? extends JsonReader.BindObject> converterFactory) {
        if (converterFactory != null) {
            if (this.binderFactories.contains(converterFactory)) {
                return false;
            }
            List<ConverterFactory<JsonReader.BindObject>> list = this.binderFactories;
            list.add(list.size() - this.settingsBinders, converterFactory);
            return true;
        }
        throw new IllegalArgumentException("factory can't be null");
    }

    public <T> void registerDefault(Class<T> cls, T t3) {
        this.defaults.put(cls, t3);
    }

    public <T, S extends T> void registerReader(Class<T> cls, JsonReader.ReadObject<S> readObject) {
        if (readObject == null) {
            this.readers.remove(cls);
        } else {
            this.readers.put(cls, readObject);
        }
    }

    public boolean registerReaderFactory(ConverterFactory<? extends JsonReader.ReadObject> converterFactory) {
        if (converterFactory != null) {
            if (this.readerFactories.contains(converterFactory)) {
                return false;
            }
            List<ConverterFactory<JsonReader.ReadObject>> list = this.readerFactories;
            list.add(list.size() - this.settingsReaders, converterFactory);
            return true;
        }
        throw new IllegalArgumentException("factory can't be null");
    }

    public <T> void registerWriter(Class<T> cls, JsonWriter.WriteObject<T> writeObject) {
        if (writeObject == null) {
            this.writerMap.remove(cls);
            this.writers.remove(cls);
            return;
        }
        this.writerMap.put(cls, cls);
        this.writers.put(cls, writeObject);
    }

    public boolean registerWriterFactory(ConverterFactory<? extends JsonWriter.WriteObject> converterFactory) {
        if (converterFactory != null) {
            if (this.writerFactories.contains(converterFactory)) {
                return false;
            }
            List<ConverterFactory<JsonWriter.WriteObject>> list = this.writerFactories;
            list.add(list.size() - this.settingsWriters, converterFactory);
            return true;
        }
        throw new IllegalArgumentException("factory can't be null");
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, T[] tArr) {
        if (tArr == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (tArr.length != 0) {
            T t3 = tArr[0];
            if (t3 != null) {
                t3.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i6 = 1; i6 < tArr.length; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t10 = tArr[i6];
                if (t10 != null) {
                    t10.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public void serializeMap(Map<String, Object> map, JsonWriter jsonWriter) {
        jsonWriter.writeByte(JsonWriter.OBJECT_START);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            Map.Entry<String, Object> next = it.next();
            jsonWriter.writeString(next.getKey());
            jsonWriter.writeByte(JsonWriter.SEMI);
            serialize(jsonWriter, next.getValue());
            for (int i6 = 1; i6 < size; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                Map.Entry<String, Object> next2 = it.next();
                jsonWriter.writeString(next2.getKey());
                jsonWriter.writeByte(JsonWriter.SEMI);
                serialize(jsonWriter, next2.getValue());
            }
        }
        jsonWriter.writeByte(JsonWriter.OBJECT_END);
    }

    public JsonReader.BindObject<?> tryFindBinder(Type type) {
        JsonReader.BindObject<?> bindObject;
        JsonReader.BindObject<?> bindObject2 = this.binders.get(type);
        if (bindObject2 != null) {
            return bindObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType != type && (bindObject = this.binders.get(extractActualType)) != null) {
            this.binders.putIfAbsent(type, bindObject);
            return bindObject;
        }
        return (JsonReader.BindObject) lookupFromFactories(type, extractActualType, this.binderFactories, this.binders);
    }

    public JsonReader.ReadObject<?> tryFindReader(Type type) {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        JsonReader.ReadObject<?> readObject;
        JsonReader.ReadObject<?> readObject2 = this.readers.get(type);
        if (readObject2 != null) {
            return readObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType != type && (readObject = this.readers.get(extractActualType)) != null) {
            this.readers.putIfAbsent(type, readObject);
            return readObject;
        }
        if (extractActualType instanceof Class) {
            Class<?> cls = (Class) extractActualType;
            if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
                JsonReader.ReadObject convertToReader = convertToReader(objectReader);
                this.readers.putIfAbsent(type, convertToReader);
                return convertToReader;
            }
        }
        return (JsonReader.ReadObject) lookupFromFactories(type, extractActualType, this.readerFactories, this.readers);
    }

    public JsonWriter.WriteObject<?> tryFindWriter(Type type) {
        JsonWriter.WriteObject<?> writeObject;
        JsonWriter.WriteObject<?> writeObject2 = this.writers.get(type);
        if (writeObject2 != null) {
            return writeObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType != type && (writeObject = this.writers.get(extractActualType)) != null) {
            this.writers.putIfAbsent(type, writeObject);
            return writeObject;
        }
        boolean z10 = extractActualType instanceof Class;
        if (z10 && JsonObject.class.isAssignableFrom((Class) extractActualType)) {
            this.writers.putIfAbsent(type, this.OBJECT_WRITER);
            return this.OBJECT_WRITER;
        }
        JsonWriter.WriteObject<?> writeObject3 = (JsonWriter.WriteObject) lookupFromFactories(type, extractActualType, this.writerFactories, this.writers);
        if (writeObject3 != null) {
            return writeObject3;
        }
        if (z10) {
            Class<?> cls = this.writerMap.get(extractActualType);
            if (cls != null) {
                return this.writers.get(cls);
            }
            Class<?> cls2 = (Class) extractActualType;
            ArrayList arrayList = new ArrayList();
            findAllSignatures(cls2, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class<?> cls3 = (Class) it.next();
                JsonWriter.WriteObject<?> writeObject4 = this.writers.get(cls3);
                if (writeObject4 == null) {
                    writeObject4 = (JsonWriter.WriteObject) lookupFromFactories(type, cls3, this.writerFactories, this.writers);
                    continue;
                }
                if (writeObject4 != null) {
                    this.writerMap.putIfAbsent(cls2, cls3);
                    return writeObject4;
                }
            }
            return null;
        }
        return null;
    }

    @Deprecated
    public DslJson(TContext tcontext, boolean z10, Fallback<TContext> fallback, boolean z11, StringCache stringCache, Iterable<Configuration> iterable) {
        this(new Settings().withContext(tcontext).withJavaConverters(z10).fallbackTo(fallback).skipDefaultValues(z11).useKeyCache(stringCache).with(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, byte[] bArr, int i6) {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        if (cls != 0) {
            if (bArr != null) {
                if (i6 == 4 && bArr[0] == 110 && bArr[1] == 117 && bArr[2] == 108 && bArr[3] == 108) {
                    return null;
                }
                if (i6 == 2 && bArr[0] == 91 && bArr[1] == 93) {
                    return new ArrayList(0);
                }
                JsonReader<TContext> process = this.localReader.get().process(bArr, i6);
                try {
                    if (process.getNextToken() != 91) {
                        if (process.wasNull()) {
                            return null;
                        }
                        throw process.newParseError("Expecting '[' for list start");
                    } else if (process.getNextToken() == 93) {
                        return new ArrayList(0);
                    } else {
                        if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
                            return process.deserializeNullableCollection(objectReader);
                        }
                        JsonReader.ReadObject tryFindReader = tryFindReader((Class) cls);
                        if (tryFindReader != null) {
                            return process.deserializeNullableCollection(tryFindReader);
                        }
                        if (this.fallback != null) {
                            Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), bArr, i6);
                            if (objArr == null) {
                                return null;
                            }
                            ArrayList arrayList = new ArrayList(objArr.length);
                            for (Object obj : objArr) {
                                arrayList.add(obj);
                            }
                            return arrayList;
                        }
                        throw createErrorMessage(cls);
                    }
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("body can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public JsonReader<TContext> newReader(byte[] bArr) {
        return new JsonReader<>(bArr, bArr.length, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonWriter newWriter(int i6) {
        return new JsonWriter(i6, this);
    }

    public JsonReader<TContext> newReader(byte[] bArr, int i6) {
        return new JsonReader<>(bArr, i6, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonWriter newWriter(byte[] bArr) {
        if (bArr != null) {
            return new JsonWriter(bArr, this);
        }
        throw new IllegalArgumentException("null value provided for buffer");
    }

    public void registerBinder(Type type, JsonReader.BindObject<?> bindObject) {
        if (bindObject == null) {
            this.binders.remove(type);
        } else {
            this.binders.put(type, bindObject);
        }
    }

    public JsonReader.ReadObject registerReader(Type type, JsonReader.ReadObject<?> readObject) {
        if (readObject == null) {
            return this.readers.remove(type);
        }
        try {
            return this.readers.get(type);
        } finally {
            this.readers.put(type, readObject);
        }
    }

    public JsonReader<TContext> newReader(byte[] bArr, int i6, char[] cArr) {
        return new JsonReader<>(bArr, i6, this.context, cArr, this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    /* loaded from: classes.dex */
    public static class RereadStream extends InputStream {
        private final byte[] buffer;
        private int position;
        private final InputStream stream;
        private boolean usingBuffer = true;

        public RereadStream(byte[] bArr, InputStream inputStream) {
            this.buffer = bArr;
            this.stream = inputStream;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.usingBuffer) {
                int i6 = this.position;
                byte[] bArr = this.buffer;
                if (i6 < bArr.length) {
                    this.position = i6 + 1;
                    return bArr[i6];
                }
                this.usingBuffer = false;
            }
            return this.stream.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            if (this.usingBuffer) {
                return super.read(bArr);
            }
            return this.stream.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) {
            if (this.usingBuffer) {
                return super.read(bArr, i6, i10);
            }
            return this.stream.read(bArr, i6, i10);
        }
    }

    public <TResult> TResult deserialize(Class<TResult> cls, byte[] bArr, int i6) {
        if (cls != null) {
            if (bArr != null) {
                JsonReader<TContext> process = this.localReader.get().process(bArr, i6);
                try {
                    process.getNextToken();
                    JsonReader.ReadObject<T> tryFindReader = tryFindReader((Class) cls);
                    if (tryFindReader != 0) {
                        return (TResult) tryFindReader.read(process);
                    }
                    if (cls.isArray()) {
                        if (process.wasNull()) {
                            return null;
                        }
                        if (process.last() == 91) {
                            Class componentType = cls.getComponentType();
                            List<TResult> deserializeList = deserializeList(componentType, bArr, i6);
                            if (deserializeList == null) {
                                return null;
                            }
                            return (TResult) convertResultToArray(componentType, deserializeList);
                        }
                        throw process.newParseError("Expecting '[' for array start");
                    }
                    Fallback<TContext> fallback = this.fallback;
                    if (fallback != null) {
                        return (TResult) fallback.deserialize(this.context, cls, bArr, i6);
                    }
                    throw createErrorMessage(cls);
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("body can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public JsonReader<TContext> newReader(InputStream inputStream, byte[] bArr) {
        JsonReader<TContext> newReader = newReader(bArr);
        newReader.process(inputStream);
        return newReader;
    }

    public JsonWriter.WriteObject registerWriter(Type type, JsonWriter.WriteObject<?> writeObject) {
        if (writeObject == null) {
            return this.writers.remove(type);
        }
        try {
            return this.writers.get(type);
        } finally {
            this.writers.put(type, writeObject);
        }
    }

    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, InputStream inputStream, byte[] bArr) {
        if (cls != null) {
            if (inputStream != null) {
                if (bArr != null) {
                    return iterateOver(cls, newReader(inputStream, bArr), inputStream);
                }
                throw new IllegalArgumentException("buffer can't be null");
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.TypeLookup
    public <T> JsonReader.BindObject<T> tryFindBinder(Class<T> cls) {
        return (JsonReader.BindObject<T>) tryFindBinder((Type) cls);
    }

    @Deprecated
    public JsonReader<TContext> newReader(String str) {
        byte[] bytes = str.getBytes(UTF8);
        return new JsonReader<>(bytes, bytes.length, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public DslJson(Settings<TContext> settings) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.writerFactories = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.readerFactories = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.binderFactories = copyOnWriteArrayList3;
        this.defaults = new ConcurrentHashMap();
        this.objectReaders = new ConcurrentHashMap();
        this.readers = new ConcurrentHashMap();
        this.binders = new ConcurrentHashMap();
        this.writers = new ConcurrentHashMap();
        this.writerMap = new ConcurrentHashMap();
        this.OBJECT_WRITER = new JsonWriter.WriteObject<JsonObject>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.5
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, JsonObject jsonObject) {
                if (jsonObject == null) {
                    jsonWriter.writeNull();
                } else {
                    jsonObject.serialize(jsonWriter, DslJson.this.omitDefaults);
                }
            }
        };
        this.OBJECT_ARRAY_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.7
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, Object obj) {
                DslJson.this.serialize(jsonWriter, (JsonObject[]) obj);
            }
        };
        this.NULL_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.9
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.writeNull();
            }
        };
        if (settings != null) {
            this.localWriter = new ThreadLocal<JsonWriter>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public JsonWriter initialValue() {
                    return new JsonWriter(4096, this);
                }
            };
            this.localReader = new ThreadLocal<JsonReader>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public JsonReader initialValue() {
                    DslJson dslJson = this;
                    return new JsonReader(new byte[4096], 4096, dslJson.context, new char[64], dslJson.keyCache, dslJson.valuesCache, dslJson, dslJson.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
                }
            };
            this.context = (TContext) ((Settings) settings).context;
            this.fallback = ((Settings) settings).fallback;
            this.omitDefaults = ((Settings) settings).omitDefaults;
            this.allowArrayFormat = ((Settings) settings).allowArrayFormat;
            this.keyCache = ((Settings) settings).keyCache;
            this.valuesCache = ((Settings) settings).valuesCache;
            this.unknownNumbers = ((Settings) settings).unknownNumbers;
            this.errorInfo = ((Settings) settings).errorInfo;
            this.doublePrecision = ((Settings) settings).doublePrecision;
            this.maxNumberDigits = ((Settings) settings).maxNumberDigits;
            this.maxStringSize = ((Settings) settings).maxStringBuffer;
            copyOnWriteArrayList.addAll(((Settings) settings).writerFactories);
            this.settingsWriters = ((Settings) settings).writerFactories.size();
            copyOnWriteArrayList2.addAll(((Settings) settings).readerFactories);
            this.settingsReaders = ((Settings) settings).readerFactories.size();
            copyOnWriteArrayList3.addAll(((Settings) settings).binderFactories);
            this.settingsBinders = ((Settings) settings).binderFactories.size();
            this.externalConverterAnalyzer = new ExternalConverterAnalyzer(((Settings) settings).classLoaders);
            this.creatorMarkers = new HashMap(((Settings) settings).creatorMarkers);
            registerReader(byte[].class, BinaryConverter.Base64Reader);
            registerWriter(byte[].class, BinaryConverter.Base64Writer);
            Class<T> cls = Boolean.TYPE;
            registerReader((Class) cls, BoolConverter.READER);
            JsonWriter.WriteObject writeObject = BoolConverter.WRITER;
            registerWriter((Class) cls, writeObject);
            registerDefault(cls, Boolean.FALSE);
            registerReader(boolean[].class, BoolConverter.ARRAY_READER);
            registerWriter(boolean[].class, BoolConverter.ARRAY_WRITER);
            registerReader(Boolean.class, BoolConverter.NULLABLE_READER);
            registerWriter(Boolean.class, writeObject);
            if (((Settings) settings).javaSpecifics) {
                registerJavaSpecifics(this);
            }
            JsonReader.ReadObject readObject = ObjectConverter.MapReader;
            registerReader(LinkedHashMap.class, readObject);
            registerReader(HashMap.class, readObject);
            registerReader(Map.class, readObject);
            registerWriter(Map.class, new JsonWriter.WriteObject<Map>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.3
                @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
                public void write(JsonWriter jsonWriter, Map map) {
                    if (map == null) {
                        jsonWriter.writeNull();
                        return;
                    }
                    try {
                        DslJson.this.serializeMap(map, jsonWriter);
                    } catch (IOException e10) {
                        throw new SerializationException(e10);
                    }
                }
            });
            registerReader(URI.class, NetConverter.UriReader);
            registerWriter(URI.class, NetConverter.UriWriter);
            registerReader(InetAddress.class, NetConverter.AddressReader);
            registerWriter(InetAddress.class, NetConverter.AddressWriter);
            registerReader((Class) Double.TYPE, NumberConverter.DOUBLE_READER);
            Class<T> cls2 = Double.TYPE;
            JsonWriter.WriteObject writeObject2 = NumberConverter.DOUBLE_WRITER;
            registerWriter((Class) cls2, writeObject2);
            registerDefault(Double.TYPE, Double.valueOf(0.0d));
            registerReader(double[].class, NumberConverter.DOUBLE_ARRAY_READER);
            registerWriter(double[].class, NumberConverter.DOUBLE_ARRAY_WRITER);
            registerReader(Double.class, NumberConverter.NULLABLE_DOUBLE_READER);
            registerWriter(Double.class, writeObject2);
            Class<T> cls3 = Float.TYPE;
            registerReader((Class) cls3, NumberConverter.FLOAT_READER);
            JsonWriter.WriteObject writeObject3 = NumberConverter.FLOAT_WRITER;
            registerWriter((Class) cls3, writeObject3);
            registerDefault(cls3, Float.valueOf(0.0f));
            registerReader(float[].class, NumberConverter.FLOAT_ARRAY_READER);
            registerWriter(float[].class, NumberConverter.FLOAT_ARRAY_WRITER);
            registerReader(Float.class, NumberConverter.NULLABLE_FLOAT_READER);
            registerWriter(Float.class, writeObject3);
            Class<T> cls4 = Integer.TYPE;
            registerReader((Class) cls4, NumberConverter.INT_READER);
            JsonWriter.WriteObject writeObject4 = NumberConverter.INT_WRITER;
            registerWriter((Class) cls4, writeObject4);
            registerDefault(cls4, 0);
            registerReader(int[].class, NumberConverter.INT_ARRAY_READER);
            registerWriter(int[].class, NumberConverter.INT_ARRAY_WRITER);
            registerReader(Integer.class, NumberConverter.NULLABLE_INT_READER);
            registerWriter(Integer.class, writeObject4);
            registerReader((Class) Short.TYPE, NumberConverter.SHORT_READER);
            Class<T> cls5 = Short.TYPE;
            JsonWriter.WriteObject writeObject5 = NumberConverter.SHORT_WRITER;
            registerWriter((Class) cls5, writeObject5);
            registerDefault(Short.TYPE, (short) 0);
            registerReader(short[].class, NumberConverter.SHORT_ARRAY_READER);
            registerWriter(short[].class, NumberConverter.SHORT_ARRAY_WRITER);
            registerReader(Short.class, NumberConverter.NULLABLE_SHORT_READER);
            registerWriter(Short.class, writeObject5);
            Class<T> cls6 = Long.TYPE;
            registerReader((Class) cls6, NumberConverter.LONG_READER);
            JsonWriter.WriteObject writeObject6 = NumberConverter.LONG_WRITER;
            registerWriter((Class) cls6, writeObject6);
            registerDefault(cls6, 0L);
            registerReader(long[].class, NumberConverter.LONG_ARRAY_READER);
            registerWriter(long[].class, NumberConverter.LONG_ARRAY_WRITER);
            registerReader(Long.class, NumberConverter.NULLABLE_LONG_READER);
            registerWriter(Long.class, writeObject6);
            registerReader(BigDecimal.class, NumberConverter.DecimalReader);
            registerWriter(BigDecimal.class, NumberConverter.DecimalWriter);
            registerReader(String.class, StringConverter.READER);
            registerWriter(String.class, StringConverter.WRITER);
            registerReader(UUID.class, UUIDConverter.READER);
            registerWriter(UUID.class, UUIDConverter.WRITER);
            registerReader(Number.class, NumberConverter.NumberReader);
            registerWriter(CharSequence.class, StringConverter.WRITER_CHARS);
            registerReader(StringBuilder.class, StringConverter.READER_BUILDER);
            registerReader(StringBuffer.class, StringConverter.READER_BUFFER);
            for (Configuration configuration : ((Settings) settings).configurations) {
                configuration.configure(this);
            }
            if (((Settings) settings).classLoaders.isEmpty() || ((Settings) settings).fromServiceLoader != 0) {
                return;
            }
            loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json_Annotation_Processor_External_Serialization");
            loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json.json.ExternalSerialization");
            loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json_ExternalSerialization");
            return;
        }
        throw new IllegalArgumentException("settings can't be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, JsonReader jsonReader, InputStream inputStream) {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        if (jsonReader.getNextToken() != 91) {
            if (jsonReader.wasNull()) {
                return null;
            }
            throw jsonReader.newParseError("Expecting '[' for iterator start");
        } else if (jsonReader.getNextToken() == 93) {
            return EMPTY_ITERATOR;
        } else {
            if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
                return jsonReader.iterateOver(objectReader);
            }
            Object tryFindReader = tryFindReader((Class) cls);
            if (tryFindReader != null) {
                return jsonReader.iterateOver((JsonReader.ReadObject) tryFindReader);
            }
            if (this.fallback != null) {
                Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), new RereadStream(jsonReader.buffer, inputStream));
                if (objArr == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add(obj);
                }
                return arrayList.iterator();
            }
            throw createErrorMessage(cls);
        }
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.TypeLookup
    public <T> JsonReader.ReadObject<T> tryFindReader(Class<T> cls) {
        return (JsonReader.ReadObject<T>) tryFindReader((Type) cls);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, T[] tArr, int i6) {
        if (jsonWriter == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (tArr == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (i6 != 0) {
            T t3 = tArr[0];
            if (t3 != null) {
                t3.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i10 = 1; i10 < i6; i10++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t10 = tArr[i10];
                if (t10 != null) {
                    t10.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.DslJson$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Iterator, j$.util.Iterator {
        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Object next() {
            return null;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
        }
    }

    public <T> JsonWriter.WriteObject<T> tryFindWriter(Class<T> cls) {
        return (JsonWriter.WriteObject<T>) tryFindWriter((Type) cls);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, List<T> list) {
        if (jsonWriter == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (list == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (list.size() != 0) {
            T t3 = list.get(0);
            if (t3 != null) {
                t3.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i6 = 1; i6 < list.size(); i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t10 = list.get(i6);
                if (t10 != null) {
                    t10.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public Object deserialize(Type type, byte[] bArr, int i6) {
        if (type instanceof Class) {
            return deserialize((Class<Object>) type, bArr, i6);
        }
        if (type != null) {
            if (bArr != null) {
                JsonReader<TContext> process = this.localReader.get().process(bArr, i6);
                try {
                    process.getNextToken();
                    Object deserializeWith = deserializeWith(type, process);
                    if (deserializeWith != unknownValue) {
                        return deserializeWith;
                    }
                    Fallback<TContext> fallback = this.fallback;
                    if (fallback != null) {
                        return fallback.deserialize(this.context, type, bArr, i6);
                    }
                    throw new ConfigurationException("Unable to find reader for provided type: " + type + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("body can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public <T> void iterateOver(java.util.Iterator<T> it, OutputStream outputStream, JsonWriter jsonWriter) {
        Class<?> cls;
        JsonWriter.WriteObject writeObject;
        if (it == null) {
            throw new IllegalArgumentException("iterator can't be null");
        }
        if (outputStream != null) {
            outputStream.write(91);
            if (!it.hasNext()) {
                outputStream.write(93);
                return;
            }
            if (jsonWriter == null) {
                jsonWriter = new JsonWriter(this);
            }
            T next = it.next();
            if (next != null) {
                cls = next.getClass();
                writeObject = getOrCreateWriter(next, cls);
                jsonWriter.reset();
                try {
                    writeObject.write(jsonWriter, next);
                    jsonWriter.toStream(outputStream);
                } catch (ConfigurationException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IOException(e11);
                }
            } else {
                outputStream.write(NULL);
                cls = null;
                writeObject = null;
            }
            while (it.hasNext()) {
                outputStream.write(44);
                T next2 = it.next();
                if (next2 != null) {
                    Class<?> cls2 = next2.getClass();
                    if (writeObject == null || cls == null || !cls.equals(cls2)) {
                        writeObject = getOrCreateWriter(next2, cls2);
                        cls = cls2;
                    }
                    jsonWriter.reset();
                    try {
                        writeObject.write(jsonWriter, next2);
                        jsonWriter.toStream(outputStream);
                    } catch (ConfigurationException e12) {
                        throw e12;
                    } catch (Exception e13) {
                        throw new IOException(e13);
                    }
                } else {
                    outputStream.write(NULL);
                }
            }
            outputStream.write(93);
            return;
        }
        throw new IllegalArgumentException("stream can't be null");
    }

    public <TResult> List<TResult> deserializeList(Class<TResult> cls, InputStream inputStream, byte[] bArr) {
        if (cls != null) {
            if (inputStream != null) {
                if (bArr != null) {
                    return deserializeList(cls, newReader(inputStream, bArr), inputStream);
                }
                throw new IllegalArgumentException("buffer can't be null");
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public <TResult> List<TResult> deserializeList(Class<TResult> cls, InputStream inputStream) {
        if (cls != null) {
            if (inputStream != null) {
                JsonReader<TContext> process = this.localReader.get().process(inputStream);
                try {
                    return deserializeList(cls, process, inputStream);
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, Collection<T> collection) {
        if (jsonWriter == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (collection == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (!collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            T next = it.next();
            if (next != null) {
                next.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            while (it.hasNext()) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T next2 = it.next();
                if (next2 != null) {
                    next2.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, JsonReader<TContext> jsonReader, InputStream inputStream) {
        JsonReader.ReadJsonObject objectReader;
        if (jsonReader.getNextToken() != 91) {
            if (jsonReader.wasNull()) {
                return null;
            }
            throw jsonReader.newParseError("Expecting '[' for list start");
        }
        if (jsonReader.getNextToken() == 93) {
            return new ArrayList(0);
        }
        if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
            return jsonReader.deserializeNullableCollection(objectReader);
        }
        JsonReader.ReadObject tryFindReader = tryFindReader((Class) cls);
        if (tryFindReader != null) {
            return jsonReader.deserializeNullableCollection(tryFindReader);
        }
        if (this.fallback != null) {
            Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), new RereadStream(jsonReader.buffer, inputStream));
            if (objArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        throw createErrorMessage(cls);
    }

    public <TResult> TResult deserialize(Class<TResult> cls, InputStream inputStream, byte[] bArr) {
        if (cls != null) {
            if (inputStream != null) {
                if (bArr != null) {
                    return (TResult) deserialize(cls, newReader(inputStream, bArr), inputStream);
                }
                throw new IllegalArgumentException("buffer can't be null");
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public <TResult> TResult deserialize(Class<TResult> cls, InputStream inputStream) {
        if (cls != null) {
            if (inputStream != null) {
                JsonReader<TContext> process = this.localReader.get().process(inputStream);
                try {
                    return (TResult) deserialize(cls, process, inputStream);
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r10 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean serialize(JsonWriter jsonWriter, Type type, Object obj) {
        Class cls;
        try {
            if (jsonWriter != null) {
                if (obj == null) {
                    jsonWriter.writeNull();
                    return true;
                } else if (obj instanceof JsonObject) {
                    ((JsonObject) obj).serialize(jsonWriter, this.omitDefaults);
                    return true;
                } else if (obj instanceof JsonObject[]) {
                    serialize(jsonWriter, (JsonObject[]) obj);
                    return true;
                } else {
                    JsonWriter.WriteObject<?> tryFindWriter = tryFindWriter(type);
                    if (tryFindWriter != null) {
                        tryFindWriter.write(jsonWriter, obj);
                        return true;
                    }
                    Class cls2 = null;
                    Class cls3 = type instanceof Class ? (Class) type : null;
                    if (cls3 != null && cls3.isArray()) {
                        if (Array.getLength(obj) == 0) {
                            jsonWriter.writeAscii("[]");
                            return true;
                        }
                        Class componentType = cls3.getComponentType();
                        if (Character.TYPE == componentType) {
                            StringConverter.serialize(new String((char[]) obj), jsonWriter);
                            return true;
                        }
                        Object tryFindWriter2 = tryFindWriter(componentType);
                        if (tryFindWriter2 != null) {
                            jsonWriter.serialize((Object[]) obj, (JsonWriter.WriteObject) tryFindWriter2);
                            return true;
                        }
                    }
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        if (collection.isEmpty()) {
                            jsonWriter.writeAscii("[]");
                            return true;
                        }
                        java.util.Iterator it = collection.iterator();
                        boolean z10 = collection instanceof List;
                        List arrayList = z10 ? (List) collection : new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Class cls4 = null;
                        Object obj2 = null;
                        boolean z11 = false;
                        do {
                            Object next = it.next();
                            if (!z10) {
                                arrayList.add(next);
                            }
                            if (next != null) {
                                Class cls5 = next.getClass();
                                Class cls6 = cls2;
                                if (cls5 != cls2) {
                                    if (cls2 != null) {
                                        boolean isAssignableFrom = cls5.isAssignableFrom(cls2);
                                        cls6 = cls2;
                                    }
                                    cls6 = cls5;
                                }
                                if (cls4 != cls5) {
                                    obj2 = tryFindWriter(cls5);
                                    cls4 = cls5;
                                }
                                arrayList2.add(obj2);
                                if (!z11 && obj2 != null) {
                                    z11 = false;
                                    cls = cls6;
                                }
                                z11 = true;
                                cls = cls6;
                            } else {
                                arrayList2.add(this.NULL_WRITER);
                                cls = cls2;
                            }
                            cls2 = cls;
                        } while (it.hasNext());
                        if (cls != null && JsonObject.class.isAssignableFrom(cls)) {
                            jsonWriter.writeByte(JsonWriter.ARRAY_START);
                            java.util.Iterator it2 = arrayList.iterator();
                            JsonObject jsonObject = (JsonObject) it2.next();
                            if (jsonObject != null) {
                                jsonObject.serialize(jsonWriter, this.omitDefaults);
                            } else {
                                jsonWriter.writeNull();
                            }
                            while (it2.hasNext()) {
                                jsonWriter.writeByte(JsonWriter.COMMA);
                                JsonObject jsonObject2 = (JsonObject) it2.next();
                                if (jsonObject2 != null) {
                                    jsonObject2.serialize(jsonWriter, this.omitDefaults);
                                } else {
                                    jsonWriter.writeNull();
                                }
                            }
                            jsonWriter.writeByte(JsonWriter.ARRAY_END);
                            return true;
                        } else if (!z11) {
                            jsonWriter.writeByte(JsonWriter.ARRAY_START);
                            java.util.Iterator it3 = arrayList.iterator();
                            ((JsonWriter.WriteObject) arrayList2.get(0)).write(jsonWriter, it3.next());
                            int i6 = 1;
                            while (it3.hasNext()) {
                                jsonWriter.writeByte(JsonWriter.COMMA);
                                ((JsonWriter.WriteObject) arrayList2.get(i6)).write(jsonWriter, it3.next());
                                i6++;
                            }
                            jsonWriter.writeByte(JsonWriter.ARRAY_END);
                            return true;
                        } else {
                            Object tryFindWriter3 = tryFindWriter(cls);
                            if (tryFindWriter3 != null) {
                                jsonWriter.serialize(collection, (JsonWriter.WriteObject) tryFindWriter3);
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            throw new IllegalArgumentException("writer can't be null");
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public <TResult> TResult deserialize(Class<TResult> cls, JsonReader jsonReader, InputStream inputStream) {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        jsonReader.getNextToken();
        JsonReader.ReadObject<T> tryFindReader = tryFindReader((Class) cls);
        if (tryFindReader != 0) {
            return (TResult) tryFindReader.read(jsonReader);
        }
        if (cls.isArray()) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                Class componentType = cls.getComponentType();
                if (jsonReader.getNextToken() == 93) {
                    return (TResult) Array.newInstance(componentType, 0);
                }
                if (JsonObject.class.isAssignableFrom(componentType) && (objectReader = getObjectReader(componentType)) != null) {
                    return (TResult) convertResultToArray(componentType, jsonReader.deserializeNullableCollection(objectReader));
                }
                Object tryFindReader2 = tryFindReader(componentType);
                if (tryFindReader2 != null) {
                    return (TResult) convertResultToArray(componentType, jsonReader.deserializeNullableCollection((JsonReader.ReadObject) tryFindReader2));
                }
            } else {
                throw jsonReader.newParseError("Expecting '[' for array start");
            }
        }
        Fallback<TContext> fallback = this.fallback;
        if (fallback != null) {
            return (TResult) fallback.deserialize(this.context, cls, new RereadStream(jsonReader.buffer, inputStream));
        }
        throw createErrorMessage(cls);
    }

    public <T> void iterateOver(java.util.Iterator<T> it, Class<T> cls, OutputStream outputStream, JsonWriter jsonWriter) {
        if (it == null) {
            throw new IllegalArgumentException("iterator can't be null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("manifest can't be null");
        }
        if (outputStream != null) {
            if (jsonWriter == null) {
                jsonWriter = new JsonWriter(this);
            }
            JsonWriter.WriteObject orCreateWriter = getOrCreateWriter(null, cls);
            outputStream.write(91);
            T next = it.next();
            if (next != null) {
                jsonWriter.reset();
                try {
                    orCreateWriter.write(jsonWriter, next);
                    jsonWriter.toStream(outputStream);
                } catch (ConfigurationException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IOException(e11);
                }
            } else {
                outputStream.write(NULL);
            }
            while (it.hasNext()) {
                outputStream.write(44);
                T next2 = it.next();
                if (next2 != null) {
                    jsonWriter.reset();
                    try {
                        orCreateWriter.write(jsonWriter, next2);
                        jsonWriter.toStream(outputStream);
                    } catch (ConfigurationException e12) {
                        throw e12;
                    } catch (Exception e13) {
                        throw new IOException(e13);
                    }
                } else {
                    outputStream.write(NULL);
                }
            }
            outputStream.write(93);
            return;
        }
        throw new IllegalArgumentException("stream can't be null");
    }

    public Object deserialize(Type type, InputStream inputStream, byte[] bArr) {
        if (type instanceof Class) {
            return deserialize((Class<Object>) type, inputStream, bArr);
        }
        if (type != null) {
            if (inputStream != null) {
                if (bArr != null) {
                    JsonReader<TContext> newReader = newReader(inputStream, bArr);
                    newReader.getNextToken();
                    Object deserializeWith = deserializeWith(type, newReader);
                    if (deserializeWith != unknownValue) {
                        return deserializeWith;
                    }
                    Fallback<TContext> fallback = this.fallback;
                    if (fallback != null) {
                        return fallback.deserialize(this.context, type, new RereadStream(bArr, inputStream));
                    }
                    throw new ConfigurationException("Unable to find reader for provided type: " + type + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
                }
                throw new IllegalArgumentException("buffer can't be null");
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public Object deserialize(Type type, InputStream inputStream) {
        if (type instanceof Class) {
            return deserialize((Class<Object>) type, inputStream);
        }
        if (type != null) {
            if (inputStream != null) {
                JsonReader<TContext> process = this.localReader.get().process(inputStream);
                try {
                    process.getNextToken();
                    Object deserializeWith = deserializeWith(type, process);
                    if (deserializeWith != unknownValue) {
                        return deserializeWith;
                    }
                    Fallback<TContext> fallback = this.fallback;
                    if (fallback != null) {
                        return fallback.deserialize(this.context, type, new RereadStream(process.buffer, inputStream));
                    }
                    throw new ConfigurationException("Unable to find reader for provided type: " + type + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
                } finally {
                    process.reset();
                }
            }
            throw new IllegalArgumentException("stream can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    public final void serialize(Object obj, OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream can't be null");
        }
        if (obj == null) {
            outputStream.write(NULL);
            return;
        }
        JsonWriter jsonWriter = this.localWriter.get();
        jsonWriter.reset(outputStream);
        Class<?> cls = obj.getClass();
        if (!serialize(jsonWriter, cls, obj)) {
            Fallback<TContext> fallback = this.fallback;
            if (fallback != null) {
                fallback.serialize(obj, outputStream);
                return;
            }
            throw new ConfigurationException(b.l("Unable to serialize provided object. Failed to find serializer for: ", cls));
        }
        jsonWriter.flush();
        jsonWriter.reset(null);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.UnknownSerializer
    public final void serialize(JsonWriter jsonWriter, Object obj) {
        if (jsonWriter == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (obj == null) {
            jsonWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (serialize(jsonWriter, cls, obj)) {
            return;
        }
        if (this.fallback != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.fallback.serialize(obj, byteArrayOutputStream);
            jsonWriter.writeAscii(byteArrayOutputStream.toByteArray());
            return;
        }
        throw new ConfigurationException(b.l("Unable to serialize provided object. Failed to find serializer for: ", cls));
    }
}
