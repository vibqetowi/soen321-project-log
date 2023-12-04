package com.ifriend.data.storages.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.ifriend.domain.data.Preferences;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: DynamicNameSharedPreferences.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001f\u001a\u00020\nH\u0002J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J!\u0010\"\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010#J!\u0010$\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010%J!\u0010&\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010'J!\u0010(\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ifriend/data/storages/sharedPreferences/DynamicNameSharedPreferences;", "Lcom/ifriend/domain/data/Preferences;", "context", "Landroid/content/Context;", "preferencesNameProvider", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "lastPreferencesName", "lastSharedPreferences", "Landroid/content/SharedPreferences;", "addValueToStringSetWithKey", "", "key", "value", "addValuesToStringSetWithKey", "values", "", "clear", "clearValue", "", "getBooleanOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithKey", CookieSpecs.DEFAULT, "getFloatWithKey", "", "getIntWithKey", "", "getLongWithKey", "", "getPreferences", "getStringSetWithKey", "getStringWithKey", "saveBooleanWithKey", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "saveFloatWithKey", "(Ljava/lang/String;Ljava/lang/Float;)V", "saveIntWithKey", "(Ljava/lang/String;Ljava/lang/Integer;)V", "saveLongWithKey", "(Ljava/lang/String;Ljava/lang/Long;)V", "saveStringWithKey", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicNameSharedPreferences implements Preferences {
    private final Context context;
    private String lastPreferencesName;
    private SharedPreferences lastSharedPreferences;
    private final Function0<String> preferencesNameProvider;

    public DynamicNameSharedPreferences(Context context, Function0<String> preferencesNameProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferencesNameProvider, "preferencesNameProvider");
        this.context = context;
        this.preferencesNameProvider = preferencesNameProvider;
        this.lastPreferencesName = preferencesNameProvider.invoke();
    }

    private final SharedPreferences getPreferences() {
        String invoke = this.preferencesNameProvider.invoke();
        if (this.lastSharedPreferences == null || !Intrinsics.areEqual(this.lastPreferencesName, invoke)) {
            this.lastPreferencesName = invoke;
            this.lastSharedPreferences = this.context.getSharedPreferences(invoke, 0);
        }
        SharedPreferences sharedPreferences = this.lastSharedPreferences;
        if (sharedPreferences == null) {
            throw new IllegalStateException("SharedPreferences is null");
        }
        Intrinsics.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }

    @Override // com.ifriend.domain.data.Preferences
    public void saveStringWithKey(String str, String str2) {
        getPreferences().edit().putString(str, str2).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public String getStringWithKey(String str) {
        return getPreferences().getString(str, null);
    }

    @Override // com.ifriend.domain.data.Preferences
    public void saveBooleanWithKey(String str, Boolean bool) {
        getPreferences().edit().putBoolean(str, Intrinsics.areEqual((Object) bool, (Object) true)).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public boolean getBooleanWithKey(String str, boolean z) {
        return getPreferences().getBoolean(str, z);
    }

    @Override // com.ifriend.domain.data.Preferences
    public Boolean getBooleanOrNull(String str) {
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str)) {
            return Boolean.valueOf(preferences.getBoolean(str, false));
        }
        return null;
    }

    @Override // com.ifriend.domain.data.Preferences
    public void saveLongWithKey(String str, Long l) {
        getPreferences().edit().putLong(str, l != null ? l.longValue() : 0L).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public long getLongWithKey(String str) {
        return getPreferences().getLong(str, 0L);
    }

    @Override // com.ifriend.domain.data.Preferences
    public void saveIntWithKey(String str, Integer num) {
        getPreferences().edit().putInt(str, num != null ? num.intValue() : 0).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public int getIntWithKey(String str) {
        return getPreferences().getInt(str, 0);
    }

    @Override // com.ifriend.domain.data.Preferences
    public void saveFloatWithKey(String str, Float f) {
        getPreferences().edit().putFloat(str, f != null ? f.floatValue() : 0.0f).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public float getFloatWithKey(String str) {
        return getPreferences().getFloat(str, 0.0f);
    }

    @Override // com.ifriend.domain.data.Preferences
    public void addValueToStringSetWithKey(String str, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        addValuesToStringSetWithKey(str, SetsKt.setOf(value));
    }

    @Override // com.ifriend.domain.data.Preferences
    public void addValuesToStringSetWithKey(String str, Set<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        HashSet stringSet = getPreferences().getStringSet(str, new HashSet());
        if (stringSet == null) {
            stringSet = new HashSet();
        }
        HashSet hashSet = new HashSet(stringSet);
        hashSet.addAll(values);
        getPreferences().edit().putStringSet(str, hashSet).apply();
    }

    @Override // com.ifriend.domain.data.Preferences
    public Set<String> getStringSetWithKey(String str) {
        Set<String> mutableSet;
        Set<String> stringSet = getPreferences().getStringSet(str, new HashSet());
        return (stringSet == null || (mutableSet = CollectionsKt.toMutableSet(stringSet)) == null) ? new HashSet() : mutableSet;
    }

    @Override // com.ifriend.domain.data.Preferences
    public boolean clearValue(String str) {
        return getPreferences().edit().remove(str).commit();
    }

    @Override // com.ifriend.domain.data.Preferences
    public void clear() {
        getPreferences().edit().clear().commit();
    }
}
