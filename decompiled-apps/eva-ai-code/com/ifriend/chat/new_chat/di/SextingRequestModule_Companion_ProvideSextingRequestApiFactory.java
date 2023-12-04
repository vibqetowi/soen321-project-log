package com.ifriend.chat.new_chat.di;

import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.SextingRequestApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class SextingRequestModule_Companion_ProvideSextingRequestApiFactory implements Factory<SextingRequestApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SextingRequestModule_Companion_ProvideSextingRequestApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public SextingRequestApi get() {
        return provideSextingRequestApi(this.retrofitProvider.get());
    }

    public static SextingRequestModule_Companion_ProvideSextingRequestApiFactory create(Provider<Retrofit> provider) {
        return new SextingRequestModule_Companion_ProvideSextingRequestApiFactory(provider);
    }

    public static SextingRequestApi provideSextingRequestApi(Retrofit retrofit) {
        return (SextingRequestApi) Preconditions.checkNotNullFromProvides(SextingRequestModule.Companion.provideSextingRequestApi(retrofit));
    }
}
