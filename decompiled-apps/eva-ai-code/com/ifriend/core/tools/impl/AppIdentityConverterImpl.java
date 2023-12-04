package com.ifriend.core.tools.impl;

import com.ifriend.core.tools.api.AppIdentityConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppIdentityConverterImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/ifriend/core/tools/impl/AppIdentityConverterImpl;", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "()V", "convertFromServerId", "", "serverId", "convertToDbId", "siteId", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppIdentityConverterImpl implements AppIdentityConverter {
    public static final Companion Companion = new Companion(null);
    private static final long SystemIdMod = 100;
    private static final long SystemIdMultiplier = 10000000000L;

    /* compiled from: AppIdentityConverterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/core/tools/impl/AppIdentityConverterImpl$Companion;", "", "()V", "SystemIdMod", "", "SystemIdMultiplier", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.core.tools.api.AppIdentityConverter
    public String convertToDbId(String siteId) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        try {
            long parseLong = Long.parseLong(siteId);
            return String.valueOf(((parseLong % 100) * 10000000000L) + (parseLong / 100));
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ifriend.core.tools.api.AppIdentityConverter
    public String convertFromServerId(String serverId) {
        Intrinsics.checkNotNullParameter(serverId, "serverId");
        try {
            long parseLong = Long.parseLong(serverId);
            return String.valueOf(((parseLong % 10000000000L) * 100) + (parseLong / 10000000000L));
        } catch (Exception unused) {
            return "";
        }
    }
}
