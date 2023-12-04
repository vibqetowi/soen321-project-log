package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/preferences/core/MutablePreferences;", "preferences", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class SettingsCache$updateConfigValue$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ Preferences.Key<T> $key;
    final /* synthetic */ T $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$2(T t, Preferences.Key<T> key, SettingsCache settingsCache, Continuation<? super SettingsCache$updateConfigValue$2> continuation) {
        super(2, continuation);
        this.$value = t;
        this.$key = key;
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, continuation);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((SettingsCache$updateConfigValue$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t = this.$value;
            if (t != 0) {
                mutablePreferences.set(this.$key, t);
            } else {
                mutablePreferences.remove(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
