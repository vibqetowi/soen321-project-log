package com.theinnerhour.b2b.persistence;

import android.content.SharedPreferences;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.d;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import sp.b;
import ta.v;
/* compiled from: LocationPersistence.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/persistence/LocationPersistence;", "", "", "key", "value", "Lhs/k;", "updatePreferences", "Lcom/theinnerhour/b2b/persistence/LocationInterface;", "locationInterface", "fetchLocationInfo", "", "isIndianUser", "getCurrentLocation", "getCurrentState", "getCurrentCountry", "TAG", "Ljava/lang/String;", "CURRENT_COUNTRY", "CURRENT_STATE", "CURRENT_LOCATION", "locationPersistence", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lhs/d;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LocationPersistence {
    public static final String CURRENT_COUNTRY = "current_country";
    public static final String CURRENT_LOCATION = "current_location";
    public static final String CURRENT_STATE = "current_state";
    private static final String TAG = "LocationPersistence";
    private static final String locationPersistence = "location_persistence";
    public static final LocationPersistence INSTANCE = new LocationPersistence();
    private static final d sharedPreferences$delegate = b.O(LocationPersistence$sharedPreferences$2.INSTANCE);

    private LocationPersistence() {
    }

    public static /* synthetic */ void fetchLocationInfo$default(LocationPersistence locationPersistence2, LocationInterface locationInterface, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            locationInterface = null;
        }
        locationPersistence2.fetchLocationInfo(locationInterface);
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = sharedPreferences$delegate.getValue();
        i.f(value, "<get-sharedPreferences>(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePreferences(String str, String str2) {
        if (str2 != null) {
            SharedPreferences.Editor edit = INSTANCE.getSharedPreferences().edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void fetchLocationInfo(LocationInterface locationInterface) {
        v.H(h.c(o0.f23642c), null, 0, new LocationPersistence$fetchLocationInfo$1(locationInterface, null), 3);
    }

    public final String getCurrentCountry() {
        String string = getSharedPreferences().getString(CURRENT_COUNTRY, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final String getCurrentLocation() {
        String string = getSharedPreferences().getString(CURRENT_LOCATION, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final String getCurrentState() {
        String string = getSharedPreferences().getString(CURRENT_STATE, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final boolean isIndianUser() {
        try {
            if (!i.b(getSharedPreferences().getString(CURRENT_COUNTRY, ""), "IN")) {
                return false;
            }
            if (!ca.a.k("Asia/Calcutta", "Asia/Kolkata").contains(TimeZone.getDefault().getID())) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, e10);
            return false;
        }
    }
}
