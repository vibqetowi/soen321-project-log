package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SharedPreferencesMigrationKt$getMigrationFunction$1(Continuation<? super SharedPreferencesMigrationKt$getMigrationFunction$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation<? super Preferences> continuation) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(continuation);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = sharedPreferencesView;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = preferences;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> keySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            ArrayList arrayList2 = arrayList;
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (Boxing.boxBoolean(!arrayList2.contains(entry.getKey())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key<Set<String>> stringSetKey = PreferencesKeys.stringSetKey(str);
                    if (value != null) {
                        mutablePreferences.set(stringSetKey, (Set) value);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                } else {
                    continue;
                }
            }
            return mutablePreferences.toPreferences();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
