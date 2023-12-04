package io.grpc.auth;

import com.google.auth.Credentials;
import com.google.auth.RequestMetadataCallback;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.CallCredentials;
import io.grpc.CallCredentials2;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GoogleAuthLibraryCallCredentials extends CallCredentials2 {
    final Credentials creds;
    private Metadata lastHeaders;
    private Map<String, List<String>> lastMetadata;
    private final boolean requirePrivacy;
    private static final Logger log = Logger.getLogger(GoogleAuthLibraryCallCredentials.class.getName());
    private static final JwtHelper jwtHelper = createJwtHelperOrNull(GoogleAuthLibraryCallCredentials.class.getClassLoader());
    private static final Class<? extends Credentials> googleCredentialsClass = loadGoogleCredentialsClass();

    @Override // io.grpc.CallCredentials
    public void thisUsesUnstableApi() {
    }

    public GoogleAuthLibraryCallCredentials(Credentials credentials) {
        this(credentials, jwtHelper);
    }

    GoogleAuthLibraryCallCredentials(Credentials credentials, JwtHelper jwtHelper2) {
        Preconditions.checkNotNull(credentials, "creds");
        Class<? extends Credentials> cls = googleCredentialsClass;
        boolean isInstance = cls != null ? cls.isInstance(credentials) : false;
        credentials = jwtHelper2 != null ? jwtHelper2.tryServiceAccountToJwt(credentials) : credentials;
        this.requirePrivacy = isInstance;
        this.creds = credentials;
    }

    @Override // io.grpc.CallCredentials2
    public void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, final CallCredentials2.MetadataApplier metadataApplier) {
        SecurityLevel securityLevel = requestInfo.getSecurityLevel();
        if (this.requirePrivacy && securityLevel != SecurityLevel.PRIVACY_AND_INTEGRITY) {
            Status status = Status.UNAUTHENTICATED;
            metadataApplier.fail(status.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: " + securityLevel));
            return;
        }
        try {
            this.creds.getRequestMetadata(serviceUri((String) Preconditions.checkNotNull(requestInfo.getAuthority(), "authority"), requestInfo.getMethodDescriptor()), executor, new RequestMetadataCallback() { // from class: io.grpc.auth.GoogleAuthLibraryCallCredentials.1
                @Override // com.google.auth.RequestMetadataCallback
                public void onSuccess(Map<String, List<String>> map) {
                    Metadata metadata;
                    try {
                        synchronized (GoogleAuthLibraryCallCredentials.this) {
                            if (GoogleAuthLibraryCallCredentials.this.lastMetadata == null || GoogleAuthLibraryCallCredentials.this.lastMetadata != map) {
                                GoogleAuthLibraryCallCredentials.this.lastHeaders = GoogleAuthLibraryCallCredentials.toHeaders(map);
                                GoogleAuthLibraryCallCredentials.this.lastMetadata = map;
                            }
                            metadata = GoogleAuthLibraryCallCredentials.this.lastHeaders;
                        }
                        metadataApplier.apply(metadata);
                    } catch (Throwable th) {
                        metadataApplier.fail(Status.UNAUTHENTICATED.withDescription("Failed to convert credential metadata").withCause(th));
                    }
                }

                @Override // com.google.auth.RequestMetadataCallback
                public void onFailure(Throwable th) {
                    if (th instanceof IOException) {
                        metadataApplier.fail(Status.UNAVAILABLE.withDescription("Credentials failed to obtain metadata").withCause(th));
                    } else {
                        metadataApplier.fail(Status.UNAUTHENTICATED.withDescription("Failed computing credential metadata").withCause(th));
                    }
                }
            });
        } catch (StatusException e) {
            metadataApplier.fail(e.getStatus());
        }
    }

    private static URI serviceUri(String str, MethodDescriptor<?, ?> methodDescriptor) throws StatusException {
        try {
            URI uri = new URI("https", str, RemoteSettings.FORWARD_SLASH_STRING + methodDescriptor.getServiceName(), null, null);
            return uri.getPort() == 443 ? removePort(uri) : uri;
        } catch (URISyntaxException e) {
            throw Status.UNAUTHENTICATED.withDescription("Unable to construct service URI for auth").withCause(e).asException();
        }
    }

    private static URI removePort(URI uri) throws StatusException {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.UNAUTHENTICATED.withDescription("Unable to construct service URI after removing port").withCause(e).asException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Metadata toHeaders(@Nullable Map<String, List<String>> map) {
        Metadata metadata = new Metadata();
        if (map != null) {
            for (String str : map.keySet()) {
                if (str.endsWith(Metadata.BINARY_HEADER_SUFFIX)) {
                    Metadata.Key of = Metadata.Key.of(str, Metadata.BINARY_BYTE_MARSHALLER);
                    for (String str2 : map.get(str)) {
                        metadata.put(of, BaseEncoding.base64().decode(str2));
                    }
                } else {
                    Metadata.Key of2 = Metadata.Key.of(str, Metadata.ASCII_STRING_MARSHALLER);
                    for (String str3 : map.get(str)) {
                        metadata.put(of2, str3);
                    }
                }
            }
        }
        return metadata;
    }

    @Nullable
    static JwtHelper createJwtHelperOrNull(ClassLoader classLoader) {
        try {
            return new JwtHelper(Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            log.log(Level.WARNING, "Failed to create JWT helper. This is unexpected", e);
            return null;
        }
    }

    @Nullable
    private static Class<? extends Credentials> loadGoogleCredentialsClass() {
        try {
            return Class.forName("com.google.auth.oauth2.GoogleCredentials").asSubclass(Credentials.class);
        } catch (ClassNotFoundException e) {
            log.log(Level.FINE, "Failed to load GoogleCredentials", (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class MethodPair {
        private final Method builderSetter;
        private final Method getter;

        private MethodPair(Method method, Method method2) {
            this.getter = method;
            this.builderSetter = method2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void apply(Credentials credentials, Object obj) throws InvocationTargetException, IllegalAccessException {
            this.builderSetter.invoke(obj, this.getter.invoke(credentials, new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class JwtHelper {
        private final Method build;
        private final Method getScopes;
        private final List<MethodPair> methodPairs;
        private final Method newJwtBuilder;
        private final Class<? extends Credentials> serviceAccountClass;

        public JwtHelper(Class<?> cls, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
            Class asSubclass = cls.asSubclass(Credentials.class);
            this.serviceAccountClass = asSubclass;
            this.getScopes = asSubclass.getMethod("getScopes", new Class[0]);
            Method declaredMethod = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(Credentials.class).getDeclaredMethod("newBuilder", new Class[0]);
            this.newJwtBuilder = declaredMethod;
            Class<?> returnType = declaredMethod.getReturnType();
            this.build = returnType.getMethod("build", new Class[0]);
            ArrayList arrayList = new ArrayList();
            this.methodPairs = arrayList;
            Method method = asSubclass.getMethod("getClientId", new Class[0]);
            arrayList.add(new MethodPair(method, returnType.getMethod("setClientId", method.getReturnType())));
            Method method2 = asSubclass.getMethod("getClientEmail", new Class[0]);
            arrayList.add(new MethodPair(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
            Method method3 = asSubclass.getMethod("getPrivateKey", new Class[0]);
            arrayList.add(new MethodPair(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
            Method method4 = asSubclass.getMethod("getPrivateKeyId", new Class[0]);
            arrayList.add(new MethodPair(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        }

        public Credentials tryServiceAccountToJwt(Credentials credentials) {
            Credentials credentials2;
            Throwable e;
            if (this.serviceAccountClass.isInstance(credentials)) {
                try {
                    credentials2 = this.serviceAccountClass.cast(credentials);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    credentials2 = credentials;
                    e = e2;
                }
                try {
                    if (((Collection) this.getScopes.invoke(credentials2, new Object[0])).size() != 0) {
                        return credentials2;
                    }
                    Object invoke = this.newJwtBuilder.invoke(null, new Object[0]);
                    for (MethodPair methodPair : this.methodPairs) {
                        methodPair.apply(credentials2, invoke);
                    }
                    return (Credentials) this.build.invoke(invoke, new Object[0]);
                } catch (IllegalAccessException e3) {
                    e = e3;
                    GoogleAuthLibraryCallCredentials.log.log(Level.WARNING, "Failed converting service account credential to JWT. This is unexpected", e);
                    return credentials2;
                } catch (InvocationTargetException e4) {
                    e = e4;
                    GoogleAuthLibraryCallCredentials.log.log(Level.WARNING, "Failed converting service account credential to JWT. This is unexpected", e);
                    return credentials2;
                }
            }
            return credentials;
        }
    }
}
