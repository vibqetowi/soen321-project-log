package io.grpc.netty.shaded.io.netty.resolver;

import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes4.dex */
public final class DefaultHostsFileEntriesResolver implements HostsFileEntriesResolver {
    private final Map<String, Inet4Address> inet4Entries;
    private final Map<String, Inet6Address> inet6Entries;

    public DefaultHostsFileEntriesResolver() {
        this(parseEntries());
    }

    DefaultHostsFileEntriesResolver(HostsFileEntries hostsFileEntries) {
        this.inet4Entries = hostsFileEntries.inet4Entries();
        this.inet6Entries = hostsFileEntries.inet6Entries();
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.resolver.DefaultHostsFileEntriesResolver$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$resolver$ResolvedAddressTypes;

        static {
            int[] iArr = new int[ResolvedAddressTypes.values().length];
            $SwitchMap$io$netty$resolver$ResolvedAddressTypes = iArr;
            try {
                iArr[ResolvedAddressTypes.IPV4_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$resolver$ResolvedAddressTypes[ResolvedAddressTypes.IPV6_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$resolver$ResolvedAddressTypes[ResolvedAddressTypes.IPV4_PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$resolver$ResolvedAddressTypes[ResolvedAddressTypes.IPV6_PREFERRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.HostsFileEntriesResolver
    public InetAddress address(String str, ResolvedAddressTypes resolvedAddressTypes) {
        String normalize = normalize(str);
        int i = AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes[resolvedAddressTypes.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Inet4Address inet4Address = this.inet4Entries.get(normalize);
                    return inet4Address != null ? inet4Address : this.inet6Entries.get(normalize);
                } else if (i == 4) {
                    Inet6Address inet6Address = this.inet6Entries.get(normalize);
                    return inet6Address != null ? inet6Address : this.inet4Entries.get(normalize);
                } else {
                    throw new IllegalArgumentException("Unknown ResolvedAddressTypes " + resolvedAddressTypes);
                }
            }
            return this.inet6Entries.get(normalize);
        }
        return this.inet4Entries.get(normalize);
    }

    String normalize(String str) {
        return str.toLowerCase(Locale.ENGLISH);
    }

    private static HostsFileEntries parseEntries() {
        return PlatformDependent.isWindows() ? HostsFileParser.parseSilently(Charset.defaultCharset(), CharsetUtil.UTF_16, CharsetUtil.UTF_8) : HostsFileParser.parseSilently();
    }
}
