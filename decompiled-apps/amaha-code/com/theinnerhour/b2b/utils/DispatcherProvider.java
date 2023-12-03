package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.o0;
/* compiled from: DispatcherProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/utils/DispatcherProvider;", "", "Lkotlinx/coroutines/a0;", "main", "default", "io", "unconfined", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface DispatcherProvider {

    /* compiled from: DispatcherProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        /* renamed from: default  reason: not valid java name */
        public static a0 m12default(DispatcherProvider dispatcherProvider) {
            return o0.f23640a;
        }

        public static a0 io(DispatcherProvider dispatcherProvider) {
            return o0.f23642c;
        }

        public static a0 main(DispatcherProvider dispatcherProvider) {
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            return kotlinx.coroutines.internal.k.f23608a;
        }

        public static a0 unconfined(DispatcherProvider dispatcherProvider) {
            return o0.f23641b;
        }
    }

    /* renamed from: default */
    a0 mo11default();

    a0 io();

    a0 main();

    a0 unconfined();
}
