package com.ifriend.data.repository.config;

import com.ifriend.domain.config.ConfigEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppConfigRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/config/ConfigEntity;", "invoke", "(Lcom/ifriend/domain/config/ConfigEntity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppConfigRepositoryImpl$getVersionLongValue$2$value$1 extends Lambda implements Function1<ConfigEntity, Boolean> {
    final /* synthetic */ String $appVersionKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$getVersionLongValue$2$value$1(String str) {
        super(1);
        this.$appVersionKey = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ConfigEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(this.$appVersionKey, it.getKey()));
    }
}
