package retrofit2;

import com.google.common.net.HttpHeaders;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.ParameterHandler;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class RequestFactory {
    private final HttpUrl baseUrl;
    @Nullable
    private final MediaType contentType;
    private final boolean hasBody;
    @Nullable
    private final Headers headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;
    @Nullable
    private final String relativeUrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RequestFactory parseAnnotations(Retrofit retrofit, Method method) {
        return new Builder(retrofit, method).build();
    }

    RequestFactory(Builder builder) {
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request create(Object[] objArr) throws IOException {
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + parameterHandlerArr.length + ")");
        }
        RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        if (this.isKotlinSuspendFunction) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            parameterHandlerArr[i].apply(requestBuilder, objArr[i]);
        }
        return requestBuilder.get().tag(Invocation.class, new Invocation(this.method, arrayList)).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Builder {
        @Nullable
        MediaType contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;
        @Nullable
        Headers headers;
        @Nullable
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;
        @Nullable
        ParameterHandler<?>[] parameterHandlers;
        final Type[] parameterTypes;
        @Nullable
        String relativeUrl;
        @Nullable
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);

        Builder(Retrofit retrofit, Method method) {
            this.retrofit = retrofit;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        RequestFactory build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new ParameterHandler[length];
            int i = length - 1;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= length) {
                    break;
                }
                ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
                Type type = this.parameterTypes[i2];
                Annotation[] annotationArr = this.parameterAnnotationsArray[i2];
                if (i2 != i) {
                    z = false;
                }
                parameterHandlerArr[i2] = parseParameter(i2, type, annotationArr, z);
                i2++;
            }
            if (this.relativeUrl != null || this.gotUrl) {
                boolean z2 = this.isFormEncoded;
                if (!z2 && !this.isMultipart && !this.hasBody && this.gotBody) {
                    throw Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z2 && !this.gotField) {
                    throw Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.isMultipart && !this.gotPart) {
                    throw Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new RequestFactory(this);
            }
            throw Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof DELETE) {
                parseHttpMethodAndPath("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                parseHttpMethodAndPath("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                parseHttpMethodAndPath("HEAD", ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                parseHttpMethodAndPath("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                parseHttpMethodAndPath("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                parseHttpMethodAndPath("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                parseHttpMethodAndPath("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                String[] value = ((retrofit2.http.Headers) annotation).value();
                if (value.length == 0) {
                    throw Utils.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(value);
            } else if (annotation instanceof Multipart) {
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (PARAM_URL_REGEX.matcher(substring).find()) {
                    throw Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private Headers parseHeaders(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.contentType = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw Utils.methodError(this.method, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        @Nullable
        private ParameterHandler<?> parseParameter(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation annotation : annotationArr) {
                    ParameterHandler<?> parseParameterAnnotation = parseParameterAnnotation(i, type, annotationArr, annotation);
                    if (parseParameterAnnotation != null) {
                        if (parameterHandler != null) {
                            throw Utils.parameterError(this.method, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        parameterHandler = parseParameterAnnotation;
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler == null) {
                if (z) {
                    try {
                        if (Utils.getRawType(type) == Continuation.class) {
                            this.isKotlinSuspendFunction = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw Utils.parameterError(this.method, i, "No Retrofit annotation found.", new Object[0]);
            }
            return parameterHandler;
        }

        @Nullable
        private ParameterHandler<?> parseParameterAnnotation(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                validateResolvableType(i, type);
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.gotPath) {
                    throw Utils.parameterError(this.method, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.relativeUrl == null) {
                    this.gotUrl = true;
                    if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new ParameterHandler.RelativeUrl(this.method, i);
                    }
                    throw Utils.parameterError(this.method, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                }
                throw Utils.parameterError(this.method, i, "@Url cannot be used with @%s URL", this.httpMethod);
            } else if (annotation instanceof Path) {
                validateResolvableType(i, type);
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.relativeUrl != null) {
                    this.gotPath = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    validatePathName(i, value);
                    return new ParameterHandler.Path(this.method, i, value, this.retrofit.stringConverter(type, annotationArr), path.encoded());
                }
                throw Utils.parameterError(this.method, i, "@Path can only be used with relative url on @%s", this.httpMethod);
            } else if (annotation instanceof Query) {
                validateResolvableType(i, type);
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> rawType = Utils.getRawType(type);
                this.gotQuery = true;
                if (Iterable.class.isAssignableFrom(rawType)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new ParameterHandler.Query(value2, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded).iterable();
                } else if (rawType.isArray()) {
                    return new ParameterHandler.Query(value2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), encoded).array();
                } else {
                    return new ParameterHandler.Query(value2, this.retrofit.stringConverter(type, annotationArr), encoded);
                }
            } else if (annotation instanceof QueryName) {
                validateResolvableType(i, type);
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> rawType2 = Utils.getRawType(type);
                this.gotQueryName = true;
                if (Iterable.class.isAssignableFrom(rawType2)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded2).iterable();
                } else if (rawType2.isArray()) {
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), encoded2).array();
                } else {
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof QueryMap) {
                validateResolvableType(i, type);
                Class<?> rawType3 = Utils.getRawType(type);
                this.gotQueryMap = true;
                if (!Map.class.isAssignableFrom(rawType3)) {
                    throw Utils.parameterError(this.method, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type supertype = Utils.getSupertype(type, rawType3, Map.class);
                if (!(supertype instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                Type parameterUpperBound = Utils.getParameterUpperBound(0, parameterizedType);
                if (String.class != parameterUpperBound) {
                    throw Utils.parameterError(this.method, i, "@QueryMap keys must be of type String: " + parameterUpperBound, new Object[0]);
                }
                return new ParameterHandler.QueryMap(this.method, i, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
            } else if (annotation instanceof Header) {
                validateResolvableType(i, type);
                String value3 = ((Header) annotation).value();
                Class<?> rawType4 = Utils.getRawType(type);
                if (Iterable.class.isAssignableFrom(rawType4)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new ParameterHandler.Header(value3, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).iterable();
                } else if (rawType4.isArray()) {
                    return new ParameterHandler.Header(value3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr)).array();
                } else {
                    return new ParameterHandler.Header(value3, this.retrofit.stringConverter(type, annotationArr));
                }
            } else if (annotation instanceof HeaderMap) {
                if (type == Headers.class) {
                    return new ParameterHandler.Headers(this.method, i);
                }
                validateResolvableType(i, type);
                Class<?> rawType5 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType5)) {
                    throw Utils.parameterError(this.method, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type supertype2 = Utils.getSupertype(type, rawType5, Map.class);
                if (!(supertype2 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                Type parameterUpperBound2 = Utils.getParameterUpperBound(0, parameterizedType2);
                if (String.class != parameterUpperBound2) {
                    throw Utils.parameterError(this.method, i, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new Object[0]);
                }
                return new ParameterHandler.HeaderMap(this.method, i, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType2), annotationArr));
            } else if (annotation instanceof Field) {
                validateResolvableType(i, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String value4 = field.value();
                boolean encoded3 = field.encoded();
                this.gotField = true;
                Class<?> rawType6 = Utils.getRawType(type);
                if (Iterable.class.isAssignableFrom(rawType6)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new ParameterHandler.Field(value4, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded3).iterable();
                } else if (rawType6.isArray()) {
                    return new ParameterHandler.Field(value4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), encoded3).array();
                } else {
                    return new ParameterHandler.Field(value4, this.retrofit.stringConverter(type, annotationArr), encoded3);
                }
            } else if (annotation instanceof FieldMap) {
                validateResolvableType(i, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> rawType7 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType7)) {
                    throw Utils.parameterError(this.method, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type supertype3 = Utils.getSupertype(type, rawType7, Map.class);
                if (!(supertype3 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                Type parameterUpperBound3 = Utils.getParameterUpperBound(0, parameterizedType3);
                if (String.class != parameterUpperBound3) {
                    throw Utils.parameterError(this.method, i, "@FieldMap keys must be of type String: " + parameterUpperBound3, new Object[0]);
                }
                Converter stringConverter = this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType3), annotationArr);
                this.gotField = true;
                return new ParameterHandler.FieldMap(this.method, i, stringConverter, ((FieldMap) annotation).encoded());
            } else if (annotation instanceof Part) {
                validateResolvableType(i, type);
                if (!this.isMultipart) {
                    throw Utils.parameterError(this.method, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                Part part = (Part) annotation;
                this.gotPart = true;
                String value5 = part.value();
                Class<?> rawType8 = Utils.getRawType(type);
                if (value5.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(rawType8)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw Utils.parameterError(this.method, i, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) type)))) {
                            throw Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else {
                            return ParameterHandler.RawPart.INSTANCE.iterable();
                        }
                    } else if (rawType8.isArray()) {
                        if (!MultipartBody.Part.class.isAssignableFrom(rawType8.getComponentType())) {
                            throw Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return ParameterHandler.RawPart.INSTANCE.array();
                    } else if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                        return ParameterHandler.RawPart.INSTANCE;
                    } else {
                        throw Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                Headers of = Headers.of(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + value5 + "\"", HttpHeaders.Names.CONTENT_TRANSFER_ENCODING, part.encoding());
                if (Iterable.class.isAssignableFrom(rawType8)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
                    }
                    Type parameterUpperBound4 = Utils.getParameterUpperBound(0, (ParameterizedType) type);
                    if (MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound4))) {
                        throw Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(parameterUpperBound4, annotationArr, this.methodAnnotations)).iterable();
                } else if (rawType8.isArray()) {
                    Class<?> boxIfPrimitive = boxIfPrimitive(rawType8.getComponentType());
                    if (MultipartBody.Part.class.isAssignableFrom(boxIfPrimitive)) {
                        throw Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(boxIfPrimitive, annotationArr, this.methodAnnotations)).array();
                } else if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                    throw Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                } else {
                    return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
                }
            } else if (annotation instanceof PartMap) {
                validateResolvableType(i, type);
                if (!this.isMultipart) {
                    throw Utils.parameterError(this.method, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.gotPart = true;
                Class<?> rawType9 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType9)) {
                    throw Utils.parameterError(this.method, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type supertype4 = Utils.getSupertype(type, rawType9, Map.class);
                if (!(supertype4 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                Type parameterUpperBound5 = Utils.getParameterUpperBound(0, parameterizedType4);
                if (String.class != parameterUpperBound5) {
                    throw Utils.parameterError(this.method, i, "@PartMap keys must be of type String: " + parameterUpperBound5, new Object[0]);
                }
                Type parameterUpperBound6 = Utils.getParameterUpperBound(1, parameterizedType4);
                if (MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound6))) {
                    throw Utils.parameterError(this.method, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new ParameterHandler.PartMap(this.method, i, this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations), ((PartMap) annotation).encoding());
            } else if (annotation instanceof Body) {
                validateResolvableType(i, type);
                if (this.isFormEncoded || this.isMultipart) {
                    throw Utils.parameterError(this.method, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.gotBody) {
                    throw Utils.parameterError(this.method, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    Converter requestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                    this.gotBody = true;
                    return new ParameterHandler.Body(this.method, i, requestBodyConverter);
                } catch (RuntimeException e) {
                    throw Utils.parameterError(this.method, e, i, "Unable to create @Body converter for %s", type);
                }
            } else if (annotation instanceof Tag) {
                validateResolvableType(i, type);
                Class<?> rawType10 = Utils.getRawType(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ParameterHandler<?> parameterHandler = this.parameterHandlers[i2];
                    if ((parameterHandler instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler).cls.equals(rawType10)) {
                        throw Utils.parameterError(this.method, i, "@Tag type " + rawType10.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new ParameterHandler.Tag(rawType10);
            } else {
                return null;
            }
        }

        private void validateResolvableType(int i, Type type) {
            if (Utils.hasUnresolvableType(type)) {
                throw Utils.parameterError(this.method, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private void validatePathName(int i, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw Utils.parameterError(this.method, i, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw Utils.parameterError(this.method, i, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }
    }
}
