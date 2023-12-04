package com.ifriend.base.navigation.api;

import com.ifriend.base.navigation.api.cicerone.Cicerone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CiceroneHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/base/navigation/api/CiceroneHolder;", "", "clearCicerone", "", "containerTag", "", "getCicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "defaultValue", "Lkotlin/Function0;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CiceroneHolder {
    void clearCicerone(String str);

    Cicerone<AppRouter> getCicerone(String str, Function0<Cicerone<AppRouter>> function0);

    /* compiled from: CiceroneHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Cicerone getCicerone$default(CiceroneHolder ciceroneHolder, String str, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function0 = CiceroneHolder$getCicerone$1.INSTANCE;
                }
                return ciceroneHolder.getCicerone(str, function0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCicerone");
        }
    }
}
