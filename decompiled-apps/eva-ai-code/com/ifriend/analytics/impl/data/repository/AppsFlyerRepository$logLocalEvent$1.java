package com.ifriend.analytics.impl.data.repository;

import com.facebook.internal.security.CertificateUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppsFlyerRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppsFlyerRepository$logLocalEvent$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final AppsFlyerRepository$logLocalEvent$1 INSTANCE = new AppsFlyerRepository$logLocalEvent$1();

    AppsFlyerRepository$logLocalEvent$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String key = it.getKey();
        String value = it.getValue();
        return "(" + ((Object) key) + CertificateUtil.DELIMITER + ((Object) value) + ")";
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        return invoke2((Map.Entry<String, String>) entry);
    }
}
