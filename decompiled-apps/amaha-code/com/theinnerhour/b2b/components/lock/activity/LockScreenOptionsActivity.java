package com.theinnerhour.b2b.components.lock.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenOptionsActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LockScreenOptionsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/lock/activity/LockScreenOptionsActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LockScreenOptionsActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f11306x = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f11307v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f11308w = new LinkedHashMap();

    public LockScreenOptionsActivity() {
        String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
        i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
        this.f11307v = stringValue;
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11308w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lock_screen_options);
        getWindow().setStatusBarColor(a.b(this, R.color.v1_status_bar_dark));
        k0().x((Toolbar) n0(R.id.my_toolbar));
        g.a l02 = l0();
        if (l02 != null) {
            l02.n();
        }
        g.a l03 = l0();
        if (l03 != null) {
            l03.m(true);
        }
        ((RobertoTextView) n0(R.id.tvCreateLock)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.j

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LockScreenOptionsActivity f13173v;

            {
                this.f13173v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                LockScreenOptionsActivity this$0 = this.f13173v;
                boolean z13 = false;
                switch (i6) {
                    case 0:
                        int i10 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str = this$0.f11307v;
                        if (str != null && str.length() != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("update_lock", true);
                            bundle2.putBoolean("create_lock", true);
                            bundle2.putBoolean("enable_back", true);
                            Intent intent = new Intent(this$0, LockScreenActivity.class);
                            intent.putExtras(bundle2);
                            this$0.startActivity(intent);
                        } else {
                            Utils.INSTANCE.showCustomToast(this$0, "You have already set a pin.");
                        }
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f11307v;
                        analyticsBundle.putBoolean("lock_present", !((str2 == null || str2.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_create", analyticsBundle);
                        return;
                    case 1:
                        int i11 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str3 = this$0.f11307v;
                        if (str3 != null && str3.length() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("update_lock", true);
                            bundle3.putBoolean("enable_back", true);
                            Intent intent2 = new Intent(this$0, LockScreenActivity.class);
                            intent2.putExtras(bundle3);
                            this$0.startActivity(intent2);
                        }
                        Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                        String str4 = this$0.f11307v;
                        analyticsBundle2.putBoolean("lock_present", !((str4 == null || str4.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_reset", analyticsBundle2);
                        return;
                    default:
                        int i12 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str5 = this$0.f11307v;
                        if (str5 != null && str5.length() != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("remove_lock", true);
                            bundle4.putBoolean("enable_back", true);
                            Intent intent3 = new Intent(this$0, LockScreenActivity.class);
                            intent3.putExtras(bundle4);
                            this$0.startActivity(intent3);
                        }
                        Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                        String str6 = this$0.f11307v;
                        analyticsBundle3.putBoolean("lock_present", !((str6 == null || str6.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_remove", analyticsBundle3);
                        return;
                }
            }
        });
        ((RobertoTextView) n0(R.id.tvResetLock)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.j

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LockScreenOptionsActivity f13173v;

            {
                this.f13173v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                LockScreenOptionsActivity this$0 = this.f13173v;
                boolean z13 = false;
                switch (i6) {
                    case 0:
                        int i10 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str = this$0.f11307v;
                        if (str != null && str.length() != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("update_lock", true);
                            bundle2.putBoolean("create_lock", true);
                            bundle2.putBoolean("enable_back", true);
                            Intent intent = new Intent(this$0, LockScreenActivity.class);
                            intent.putExtras(bundle2);
                            this$0.startActivity(intent);
                        } else {
                            Utils.INSTANCE.showCustomToast(this$0, "You have already set a pin.");
                        }
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f11307v;
                        analyticsBundle.putBoolean("lock_present", !((str2 == null || str2.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_create", analyticsBundle);
                        return;
                    case 1:
                        int i11 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str3 = this$0.f11307v;
                        if (str3 != null && str3.length() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("update_lock", true);
                            bundle3.putBoolean("enable_back", true);
                            Intent intent2 = new Intent(this$0, LockScreenActivity.class);
                            intent2.putExtras(bundle3);
                            this$0.startActivity(intent2);
                        }
                        Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                        String str4 = this$0.f11307v;
                        analyticsBundle2.putBoolean("lock_present", !((str4 == null || str4.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_reset", analyticsBundle2);
                        return;
                    default:
                        int i12 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str5 = this$0.f11307v;
                        if (str5 != null && str5.length() != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("remove_lock", true);
                            bundle4.putBoolean("enable_back", true);
                            Intent intent3 = new Intent(this$0, LockScreenActivity.class);
                            intent3.putExtras(bundle4);
                            this$0.startActivity(intent3);
                        }
                        Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                        String str6 = this$0.f11307v;
                        analyticsBundle3.putBoolean("lock_present", !((str6 == null || str6.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_remove", analyticsBundle3);
                        return;
                }
            }
        });
        ((RobertoTextView) n0(R.id.tvRemoveLock)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.j

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LockScreenOptionsActivity f13173v;

            {
                this.f13173v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                LockScreenOptionsActivity this$0 = this.f13173v;
                boolean z13 = false;
                switch (i6) {
                    case 0:
                        int i10 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str = this$0.f11307v;
                        if (str != null && str.length() != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("update_lock", true);
                            bundle2.putBoolean("create_lock", true);
                            bundle2.putBoolean("enable_back", true);
                            Intent intent = new Intent(this$0, LockScreenActivity.class);
                            intent.putExtras(bundle2);
                            this$0.startActivity(intent);
                        } else {
                            Utils.INSTANCE.showCustomToast(this$0, "You have already set a pin.");
                        }
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f11307v;
                        analyticsBundle.putBoolean("lock_present", !((str2 == null || str2.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_create", analyticsBundle);
                        return;
                    case 1:
                        int i11 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str3 = this$0.f11307v;
                        if (str3 != null && str3.length() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("update_lock", true);
                            bundle3.putBoolean("enable_back", true);
                            Intent intent2 = new Intent(this$0, LockScreenActivity.class);
                            intent2.putExtras(bundle3);
                            this$0.startActivity(intent2);
                        }
                        Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                        String str4 = this$0.f11307v;
                        analyticsBundle2.putBoolean("lock_present", !((str4 == null || str4.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_reset", analyticsBundle2);
                        return;
                    default:
                        int i12 = LockScreenOptionsActivity.f11306x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str5 = this$0.f11307v;
                        if (str5 != null && str5.length() != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please set your pin first.");
                        } else {
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("remove_lock", true);
                            bundle4.putBoolean("enable_back", true);
                            Intent intent3 = new Intent(this$0, LockScreenActivity.class);
                            intent3.putExtras(bundle4);
                            this$0.startActivity(intent3);
                        }
                        Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                        String str6 = this$0.f11307v;
                        analyticsBundle3.putBoolean("lock_present", !((str6 == null || str6.length() == 0) ? true : true));
                        UtilsKt.fireAnalytics("lock_remove", analyticsBundle3);
                        return;
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.g(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        boolean z10;
        String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
        i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
        this.f11307v = stringValue;
        if (stringValue.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((RobertoTextView) n0(R.id.tvCreateLock)).setText("Set pin");
            ((RobertoTextView) n0(R.id.tvResetLock)).setText("Change pin (Please set your pin first.)");
            ((RobertoTextView) n0(R.id.tvRemoveLock)).setText("Remove pin (Please set your pin first.)");
            ((RobertoTextView) n0(R.id.tvCreateLock)).setAlpha(1.0f);
            ((RobertoTextView) n0(R.id.tvResetLock)).setAlpha(0.4f);
            ((RobertoTextView) n0(R.id.tvRemoveLock)).setAlpha(0.4f);
        } else {
            ((RobertoTextView) n0(R.id.tvCreateLock)).setText("Set pin (You have already set a pin.)");
            ((RobertoTextView) n0(R.id.tvResetLock)).setText("Change pin");
            ((RobertoTextView) n0(R.id.tvRemoveLock)).setText("Remove pin");
            ((RobertoTextView) n0(R.id.tvCreateLock)).setAlpha(0.4f);
            ((RobertoTextView) n0(R.id.tvResetLock)).setAlpha(1.0f);
            ((RobertoTextView) n0(R.id.tvRemoveLock)).setAlpha(1.0f);
        }
        super.onResume();
    }
}
