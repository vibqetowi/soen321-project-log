package com.ifriend.app.di.modules.platform;

import android.content.Context;
import com.google.api.gax.core.CredentialsProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.stub.GrpcSpeechStub;
import com.google.cloud.speech.v1.stub.SpeechStubSettings;
import com.ifriend.app.R;
import com.ifriend.app.di.modules.platform.PlatformToolsModule;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.platform.tools.impl.AppInfoProviderImpl;
import com.ifriend.platform.tools.impl.ResourceProviderImpl;
import com.ifriend.platform.tools.impl.permissions.PermissionProviderImpl;
import com.ifriend.platform.tools.impl.speech.TextToSpeechStreamImpl;
import com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PlatformToolsModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'¨\u0006\u0013"}, d2 = {"Lcom/ifriend/app/di/modules/platform/PlatformToolsModule;", "", "bindsAppInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "impl", "Lcom/ifriend/platform/tools/impl/AppInfoProviderImpl;", "bindsPermissionProvider", "Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "Lcom/ifriend/platform/tools/impl/permissions/PermissionProviderImpl;", "bindsResourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/platform/tools/impl/ResourceProviderImpl;", "bindsTextToSpeechStream", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "Lcom/ifriend/platform/tools/impl/speech/TextToSpeechStreamImpl;", "bindsVoiceRecognitionStreaming", "Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "Lcom/ifriend/platform/tools/impl/speech/VoiceRecognitionStreamingImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface PlatformToolsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    AppInfoProvider bindsAppInfoProvider(AppInfoProviderImpl appInfoProviderImpl);

    @Reusable
    @Binds
    PermissionProvider bindsPermissionProvider(PermissionProviderImpl permissionProviderImpl);

    @Singleton
    @Binds
    ResourceProvider bindsResourceProvider(ResourceProviderImpl resourceProviderImpl);

    @Binds
    TextToSpeechStream bindsTextToSpeechStream(TextToSpeechStreamImpl textToSpeechStreamImpl);

    @Binds
    VoiceRecognitionStreaming bindsVoiceRecognitionStreaming(VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl);

    /* compiled from: PlatformToolsModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/platform/PlatformToolsModule$Companion;", "", "()V", "provideSpeechClient", "Lcom/google/cloud/speech/v1/SpeechClient;", "context", "Landroid/content/Context;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r2v6, types: [com.google.cloud.speech.v1.stub.SpeechStubSettings] */
        @Provides
        @Singleton
        public final SpeechClient provideSpeechClient(final Context context) {
            GrpcSpeechStub grpcSpeechStub;
            Intrinsics.checkNotNullParameter(context, "context");
            CredentialsProvider credentialsProvider = new CredentialsProvider() { // from class: com.ifriend.app.di.modules.platform.PlatformToolsModule$Companion$$ExternalSyntheticLambda0
                @Override // com.google.api.gax.core.CredentialsProvider
                public final Credentials getCredentials() {
                    Credentials provideSpeechClient$lambda$1;
                    provideSpeechClient$lambda$1 = PlatformToolsModule.Companion.provideSpeechClient$lambda$1(context);
                    return provideSpeechClient$lambda$1;
                }
            };
            SpeechStubSettings.Builder newBuilder = SpeechStubSettings.newBuilder();
            if (newBuilder != null) {
                newBuilder.setCredentialsProvider(credentialsProvider);
                newBuilder.setEndpoint("speech.googleapis.com:443");
                grpcSpeechStub = GrpcSpeechStub.create((SpeechStubSettings) newBuilder.build());
            } else {
                grpcSpeechStub = null;
            }
            SpeechClient create = SpeechClient.create(grpcSpeechStub);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Credentials provideSpeechClient$lambda$1(Context context) {
            Intrinsics.checkNotNullParameter(context, "$context");
            return ServiceAccountCredentials.fromStream(context.getResources().openRawResource(R.raw.google_credentials));
        }
    }
}
