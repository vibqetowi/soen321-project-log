package io.grpc.grpclb;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.InternalServiceProviders;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.internal.GrpcUtil;
import java.net.URI;
/* loaded from: classes4.dex */
final class SecretGrpclbNameResolverProvider {
    private SecretGrpclbNameResolverProvider() {
    }

    /* loaded from: classes4.dex */
    public static final class Provider extends NameResolverProvider {
        private static final String SCHEME = "dns";

        @Override // io.grpc.NameResolver.Factory
        public String getDefaultScheme() {
            return SCHEME;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.NameResolverProvider
        public boolean isAvailable() {
            return true;
        }

        @Override // io.grpc.NameResolverProvider
        public int priority() {
            return 6;
        }

        @Override // io.grpc.NameResolver.Factory
        public GrpclbNameResolver newNameResolver(URI uri, NameResolver.Args args) {
            if (SCHEME.equals(uri.getScheme())) {
                String str = (String) Preconditions.checkNotNull(uri.getPath(), "targetPath");
                Preconditions.checkArgument(str.startsWith(RemoteSettings.FORWARD_SLASH_STRING), "the path component (%s) of the target (%s) must start with '/'", str, uri);
                return new GrpclbNameResolver(uri.getAuthority(), str.substring(1), args, GrpcUtil.SHARED_CHANNEL_EXECUTOR, Stopwatch.createUnstarted(), InternalServiceProviders.isAndroid(getClass().getClassLoader()));
            }
            return null;
        }
    }
}
