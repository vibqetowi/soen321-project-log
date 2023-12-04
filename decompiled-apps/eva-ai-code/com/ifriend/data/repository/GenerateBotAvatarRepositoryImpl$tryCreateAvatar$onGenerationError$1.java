package com.ifriend.data.repository;

import com.ifriend.data.networking.api.GenerateBotAvatarResponse;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.generateAvatar.GenerateAvatarException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import retrofit2.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1 extends Lambda implements Function0 {
    final /* synthetic */ Response<GenerateBotAvatarResponse> $response;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$tryCreateAvatar$onGenerationError$1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Response<GenerateBotAvatarResponse> response) {
        super(0);
        this.this$0 = generateBotAvatarRepositoryImpl;
        this.$response = response;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Void invoke() {
        Preferences preferences;
        preferences = this.this$0.preferences;
        GenerateBotAvatarResponse body = this.$response.body();
        preferences.saveStringWithKey("generationIdErrorWatched", body != null ? body.getGenerationId() : null);
        throw GenerateAvatarException.INSTANCE;
    }
}
