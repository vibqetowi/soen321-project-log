package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.data.networking.api.NeuronsApi;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
/* compiled from: NeuronsModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/presentation/di/NeuronsModule;", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface NeuronsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: NeuronsModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/di/NeuronsModule$Companion;", "", "()V", "provideNeuronsApi", "Lcom/ifriend/data/networking/api/NeuronsApi;", "retrofit", "Lretrofit2/Retrofit;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final NeuronsApi provideNeuronsApi(Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(NeuronsApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (NeuronsApi) create;
        }
    }
}
