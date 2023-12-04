package com.ifriend.base.navigation.api;

import com.ifriend.base.navigation.api.cicerone.Cicerone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CiceroneHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CiceroneHolder$getCicerone$1 extends Lambda implements Function0<Cicerone<AppRouter>> {
    public static final CiceroneHolder$getCicerone$1 INSTANCE = new CiceroneHolder$getCicerone$1();

    CiceroneHolder$getCicerone$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Cicerone<AppRouter> invoke() {
        return Cicerone.Companion.create(new AppRouter());
    }
}
