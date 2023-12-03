package com.theinnerhour.b2b.persistence;

import android.content.SharedPreferences;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
/* compiled from: LocationPersistence.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LocationPersistence$sharedPreferences$2 extends k implements ss.a<SharedPreferences> {
    public static final LocationPersistence$sharedPreferences$2 INSTANCE = new LocationPersistence$sharedPreferences$2();

    public LocationPersistence$sharedPreferences$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final SharedPreferences invoke() {
        return MyApplication.V.a().getSharedPreferences("location_persistence", 0);
    }
}
