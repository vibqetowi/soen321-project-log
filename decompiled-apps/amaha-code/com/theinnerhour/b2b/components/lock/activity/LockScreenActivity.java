package com.theinnerhour.b2b.components.lock.activity;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.o0;
import cn.z0;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.w;
import dn.d;
import dn.e;
import dn.f;
import dn.g;
import dn.h;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LockScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/lock/activity/LockScreenActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LockScreenActivity extends c {
    public static final /* synthetic */ int E = 0;
    public boolean B;
    public en.a C;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11302w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11303x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11304y;

    /* renamed from: z  reason: collision with root package name */
    public int f11305z;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11301v = LogHelper.INSTANCE.makeLogTag("LockScreenActivity");
    public String A = "";

    /* compiled from: LockScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a() {
            return MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false);
        }

        public static void b(boolean z10) {
            MyApplication.V.a().getSharedPreferences("lock_code", 0).edit().putBoolean("set_lock_code", z10).commit();
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.D;
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

    public final void o0() {
        ((RobertoEditText) n0(R.id.editLock1)).setText("");
        ((RobertoEditText) n0(R.id.editLock2)).setText("");
        ((RobertoEditText) n0(R.id.editLock3)).setText("");
        ((RobertoEditText) n0(R.id.editLock4)).setText("");
        ((RobertoEditText) n0(R.id.editLock1)).requestFocus();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if ((this.f11302w || this.f11304y) && !a.a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        en.a aVar;
        g.a l02;
        super.onCreate(bundle);
        setContentView(R.layout.activity_lock_screen);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        k0().x((Toolbar) n0(R.id.my_toolbar));
        g.a l03 = l0();
        if (l03 != null) {
            l03.n();
        }
        boolean z11 = false;
        this.f11302w = getIntent().getBooleanExtra("update_lock", false);
        this.f11304y = getIntent().getBooleanExtra("remove_lock", false);
        boolean booleanExtra = getIntent().getBooleanExtra("create_lock", false);
        this.f11303x = booleanExtra;
        if (booleanExtra) {
            ((RobertoTextView) n0(R.id.tvForgotLockTitle)).setText("Set Pin");
        } else if (this.f11302w) {
            ((RobertoTextView) n0(R.id.tvForgotLockTitle)).setText("Change Pin");
        } else if (this.f11304y) {
            ((RobertoTextView) n0(R.id.tvForgotLockTitle)).setText("Remove Pin");
        } else {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                String firstName = user.getFirstName();
                if (firstName != null && firstName.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    ((RobertoTextView) n0(R.id.tvForgotLockTitle)).setText("Welcome, " + user.getFirstName() + '!');
                }
            }
            ((RobertoTextView) n0(R.id.tvForgotLock)).setVisibility(0);
        }
        if (this.f11302w) {
            String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
            i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
            if (i.b(stringValue, "")) {
                this.f11305z++;
            }
        }
        if (getIntent().getBooleanExtra("enable_back", false) && (l02 = l0()) != null) {
            l02.m(true);
        }
        Application application = getApplication();
        i.f(application, "application");
        this.C = (en.a) new o0(this, new z0(application, 1)).a(en.a.class);
        t0();
        RobertoEditText editLock1 = (RobertoEditText) n0(R.id.editLock1);
        i.f(editLock1, "editLock1");
        r0(editLock1);
        RobertoEditText editLock2 = (RobertoEditText) n0(R.id.editLock2);
        i.f(editLock2, "editLock2");
        r0(editLock2);
        RobertoEditText editLock3 = (RobertoEditText) n0(R.id.editLock3);
        i.f(editLock3, "editLock3");
        r0(editLock3);
        RobertoEditText editLock4 = (RobertoEditText) n0(R.id.editLock4);
        i.f(editLock4, "editLock4");
        r0(editLock4);
        ((RobertoEditText) n0(R.id.editLock2)).setOnKeyListener(new dn.c(this));
        ((RobertoEditText) n0(R.id.editLock3)).setOnKeyListener(new d(this));
        ((RobertoEditText) n0(R.id.editLock4)).setOnKeyListener(new e(this));
        ((RobertoEditText) n0(R.id.editLock1)).addTextChangedListener(new f(this));
        ((RobertoEditText) n0(R.id.editLock2)).addTextChangedListener(new g(this));
        ((RobertoEditText) n0(R.id.editLock3)).addTextChangedListener(new h(this));
        ((RobertoEditText) n0(R.id.editLock4)).addTextChangedListener(new dn.i(this));
        ((RobertoTextView) n0(R.id.tvForgotLock)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LockScreenActivity f13162v;

            {
                this.f13162v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                LockScreenActivity this$0 = this.f13162v;
                switch (i6) {
                    case 0:
                        int i10 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        b.a title = new b.a(this$0).setTitle(this$0.getString(R.string.forgotPINTitle));
                        title.f1046a.f1031g = this$0.getString(R.string.forgotPINMessage);
                        title.setPositiveButton(R.string.forgotPINCTAYes, new b(this$0, 2)).setNegativeButton(R.string.forgotPINCTANotNow, null).c();
                        return;
                    case 1:
                        int i11 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        LockScreenActivity.a.b(false);
                        this$0.finish();
                        return;
                    default:
                        int i12 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            boolean z12 = !this$0.B;
                            this$0.B = z12;
                            if (z12) {
                                ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_show_password);
                                ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(null);
                            } else {
                                ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_hide_password);
                                ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(new PasswordTransformationMethod());
                            }
                            Editable text = ((RobertoEditText) this$0.n0(R.id.editLock1)).getText();
                            kotlin.jvm.internal.i.d(text);
                            ((RobertoEditText) this$0.n0(R.id.editLock1)).setSelection(text.length());
                            Editable text2 = ((RobertoEditText) this$0.n0(R.id.editLock2)).getText();
                            kotlin.jvm.internal.i.d(text2);
                            ((RobertoEditText) this$0.n0(R.id.editLock2)).setSelection(text2.length());
                            Editable text3 = ((RobertoEditText) this$0.n0(R.id.editLock3)).getText();
                            kotlin.jvm.internal.i.d(text3);
                            ((RobertoEditText) this$0.n0(R.id.editLock3)).setSelection(text3.length());
                            Editable text4 = ((RobertoEditText) this$0.n0(R.id.editLock4)).getText();
                            kotlin.jvm.internal.i.d(text4);
                            ((RobertoEditText) this$0.n0(R.id.editLock4)).setSelection(text4.length());
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f11301v, "exception", e10);
                            return;
                        }
                }
            }
        });
        if (a.a()) {
            ((RobertoTextView) n0(R.id.tvForgotSkip)).setVisibility(0);
            ((RobertoTextView) n0(R.id.tvForgotSkip)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LockScreenActivity f13162v;

                {
                    this.f13162v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    LockScreenActivity this$0 = this.f13162v;
                    switch (i6) {
                        case 0:
                            int i10 = LockScreenActivity.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a title = new b.a(this$0).setTitle(this$0.getString(R.string.forgotPINTitle));
                            title.f1046a.f1031g = this$0.getString(R.string.forgotPINMessage);
                            title.setPositiveButton(R.string.forgotPINCTAYes, new b(this$0, 2)).setNegativeButton(R.string.forgotPINCTANotNow, null).c();
                            return;
                        case 1:
                            int i11 = LockScreenActivity.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            LockScreenActivity.a.b(false);
                            this$0.finish();
                            return;
                        default:
                            int i12 = LockScreenActivity.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                boolean z12 = !this$0.B;
                                this$0.B = z12;
                                if (z12) {
                                    ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_show_password);
                                    ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(null);
                                    ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(null);
                                    ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(null);
                                    ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(null);
                                } else {
                                    ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_hide_password);
                                    ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(new PasswordTransformationMethod());
                                    ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(new PasswordTransformationMethod());
                                    ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(new PasswordTransformationMethod());
                                    ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(new PasswordTransformationMethod());
                                }
                                Editable text = ((RobertoEditText) this$0.n0(R.id.editLock1)).getText();
                                kotlin.jvm.internal.i.d(text);
                                ((RobertoEditText) this$0.n0(R.id.editLock1)).setSelection(text.length());
                                Editable text2 = ((RobertoEditText) this$0.n0(R.id.editLock2)).getText();
                                kotlin.jvm.internal.i.d(text2);
                                ((RobertoEditText) this$0.n0(R.id.editLock2)).setSelection(text2.length());
                                Editable text3 = ((RobertoEditText) this$0.n0(R.id.editLock3)).getText();
                                kotlin.jvm.internal.i.d(text3);
                                ((RobertoEditText) this$0.n0(R.id.editLock3)).setSelection(text3.length());
                                Editable text4 = ((RobertoEditText) this$0.n0(R.id.editLock4)).getText();
                                kotlin.jvm.internal.i.d(text4);
                                ((RobertoEditText) this$0.n0(R.id.editLock4)).setSelection(text4.length());
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11301v, "exception", e10);
                                return;
                            }
                    }
                }
            });
        }
        ((AppCompatImageView) n0(R.id.imgLockToggle)).setOnClickListener(new View.OnClickListener(this) { // from class: dn.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LockScreenActivity f13162v;

            {
                this.f13162v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                LockScreenActivity this$0 = this.f13162v;
                switch (i6) {
                    case 0:
                        int i10 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        b.a title = new b.a(this$0).setTitle(this$0.getString(R.string.forgotPINTitle));
                        title.f1046a.f1031g = this$0.getString(R.string.forgotPINMessage);
                        title.setPositiveButton(R.string.forgotPINCTAYes, new b(this$0, 2)).setNegativeButton(R.string.forgotPINCTANotNow, null).c();
                        return;
                    case 1:
                        int i11 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        LockScreenActivity.a.b(false);
                        this$0.finish();
                        return;
                    default:
                        int i12 = LockScreenActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            boolean z12 = !this$0.B;
                            this$0.B = z12;
                            if (z12) {
                                ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_show_password);
                                ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(null);
                                ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(null);
                            } else {
                                ((AppCompatImageView) this$0.n0(R.id.imgLockToggle)).setImageResource(R.drawable.ic_hide_password);
                                ((RobertoEditText) this$0.n0(R.id.editLock1)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock2)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock3)).setTransformationMethod(new PasswordTransformationMethod());
                                ((RobertoEditText) this$0.n0(R.id.editLock4)).setTransformationMethod(new PasswordTransformationMethod());
                            }
                            Editable text = ((RobertoEditText) this$0.n0(R.id.editLock1)).getText();
                            kotlin.jvm.internal.i.d(text);
                            ((RobertoEditText) this$0.n0(R.id.editLock1)).setSelection(text.length());
                            Editable text2 = ((RobertoEditText) this$0.n0(R.id.editLock2)).getText();
                            kotlin.jvm.internal.i.d(text2);
                            ((RobertoEditText) this$0.n0(R.id.editLock2)).setSelection(text2.length());
                            Editable text3 = ((RobertoEditText) this$0.n0(R.id.editLock3)).getText();
                            kotlin.jvm.internal.i.d(text3);
                            ((RobertoEditText) this$0.n0(R.id.editLock3)).setSelection(text3.length());
                            Editable text4 = ((RobertoEditText) this$0.n0(R.id.editLock4)).getText();
                            kotlin.jvm.internal.i.d(text4);
                            ((RobertoEditText) this$0.n0(R.id.editLock4)).setSelection(text4.length());
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f11301v, "exception", e10);
                            return;
                        }
                }
            }
        });
        if ((!this.f11303x || !this.f11302w || !this.f11304y || !a.a()) && ApplicationPersistence.getInstance().getLongValue(Constants.LOCK_FAILED_TIME) != 0) {
            if (this.C != null) {
                if (TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.LOCK_FAILED_TIME), TimeUnit.MILLISECONDS) <= aVar.A) {
                    z11 = true;
                }
                if (z11) {
                    p0("Please try after sometime");
                    return;
                } else {
                    ApplicationPersistence.getInstance().setLongValue(Constants.LOCK_FAILED_TIME, 0L);
                    return;
                }
            }
            i.q("lockScreenViewModel");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.g(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public final void p0(String str) {
        ((RobertoEditText) n0(R.id.editLock1)).setEnabled(false);
        ((RobertoEditText) n0(R.id.editLock2)).setEnabled(false);
        ((RobertoEditText) n0(R.id.editLock3)).setEnabled(false);
        ((RobertoEditText) n0(R.id.editLock4)).setEnabled(false);
        ((RobertoTextView) n0(R.id.tvError)).setText(str);
        ((RobertoTextView) n0(R.id.tvError)).setVisibility(0);
        ((RobertoEditText) n0(R.id.editLock1)).setBackgroundResource(R.drawable.background_lock_code_disabled);
        ((RobertoEditText) n0(R.id.editLock2)).setBackgroundResource(R.drawable.background_lock_code_disabled);
        ((RobertoEditText) n0(R.id.editLock3)).setBackgroundResource(R.drawable.background_lock_code_disabled);
        ((RobertoEditText) n0(R.id.editLock4)).setBackgroundResource(R.drawable.background_lock_code_disabled);
    }

    public final void q0(String str) {
        ((RobertoTextView) n0(R.id.tvError)).setText(str);
        ((RobertoTextView) n0(R.id.tvError)).setVisibility(0);
        ((RobertoEditText) n0(R.id.editLock1)).setBackgroundResource(R.drawable.background_lock_code_error);
        ((RobertoEditText) n0(R.id.editLock2)).setBackgroundResource(R.drawable.background_lock_code_error);
        ((RobertoEditText) n0(R.id.editLock3)).setBackgroundResource(R.drawable.background_lock_code_error);
        ((RobertoEditText) n0(R.id.editLock4)).setBackgroundResource(R.drawable.background_lock_code_error);
    }

    public final void r0(RobertoEditText robertoEditText) {
        try {
            robertoEditText.setOnEditorActionListener(new w(3, this));
            if (Build.VERSION.SDK_INT >= 26) {
                robertoEditText.setImportantForAutofill(2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11301v, "Exception", e10);
        }
    }

    public final void s0() {
        String str;
        String str2;
        String str3 = this.f11301v;
        ((RobertoTextView) n0(R.id.tvError)).setText("");
        ((RobertoTextView) n0(R.id.tvError)).setVisibility(8);
        ((RobertoEditText) n0(R.id.editLock1)).setBackgroundResource(R.drawable.background_lock_code);
        ((RobertoEditText) n0(R.id.editLock2)).setBackgroundResource(R.drawable.background_lock_code);
        ((RobertoEditText) n0(R.id.editLock3)).setBackgroundResource(R.drawable.background_lock_code);
        ((RobertoEditText) n0(R.id.editLock4)).setBackgroundResource(R.drawable.background_lock_code);
        ((RobertoEditText) n0(R.id.editLock1)).requestFocus();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) ((RobertoEditText) n0(R.id.editLock1)).getText());
            sb2.append((Object) ((RobertoEditText) n0(R.id.editLock2)).getText());
            sb2.append((Object) ((RobertoEditText) n0(R.id.editLock3)).getText());
            sb2.append((Object) ((RobertoEditText) n0(R.id.editLock4)).getText());
            str = sb2.toString();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str3, "Exception", e10);
            str = "";
        }
        if (str.length() != 4) {
            o0();
            q0("Your pin should have 4 digits. Please try again.");
        } else if (this.C != null) {
            String str4 = FirebaseAuth.getInstance().a() + str;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset forName = Charset.forName("UTF-8");
                i.f(forName, "forName(charsetName)");
                byte[] bytes = str4.getBytes(forName);
                i.f(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] hash = messageDigest.digest(bytes);
                i.f(hash, "hash");
                str2 = en.a.e(hash);
            } catch (Exception e11) {
                e11.printStackTrace();
                str2 = null;
            }
            boolean z10 = true;
            if (this.f11302w) {
                int i6 = this.f11305z;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            if (!i.b(str2, this.A)) {
                                o0();
                                q0("The pins do not match. Please try again.");
                                return;
                            }
                            this.f11305z++;
                            ApplicationPersistence.getInstance().setStringValue("user_lock_code", str2);
                            Utils.INSTANCE.showCustomToast(this, "Your security pin has been set!");
                            a.b(false);
                            finish();
                            return;
                        }
                        return;
                    }
                    this.f11305z = i6 + 1;
                    i.d(str2);
                    this.A = str2;
                    t0();
                    UtilsKt.fireAnalytics("lock_new_code", UtilsKt.getAnalyticsBundle());
                    return;
                }
                String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
                i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
                if (!i.b(stringValue, str2)) {
                    o0();
                    q0("Lock code doesn't match");
                    UtilsKt.fireAnalytics("lock_validate_no_match", UtilsKt.getAnalyticsBundle());
                    return;
                }
                this.f11305z++;
                t0();
                UtilsKt.fireAnalytics("lock_validate_match", UtilsKt.getAnalyticsBundle());
                return;
            }
            String stringValue2 = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
            i.f(stringValue2, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.i(str3, "sp password ".concat(stringValue2));
            logHelper.i(str3, c.r("entered password ", str2));
            if (i.b(stringValue2, str2)) {
                if (this.f11304y) {
                    b.a title = new b.a(this).setTitle("");
                    title.f1046a.f1031g = "Are you sure you want to remove your security pin?";
                    title.b("Yes", new dn.b(this, 0));
                    title.a("No", new dn.b(this, 1));
                    title.c();
                } else {
                    ApplicationPersistence.getInstance().setIntValue(Constants.LOCK_FAILED_ATTEMPTS, 0);
                    finish();
                }
                UtilsKt.fireAnalytics("lock_code_match", UtilsKt.getAnalyticsBundle());
                return;
            }
            o0();
            en.a aVar = this.C;
            if (aVar != null) {
                int i10 = aVar.f14419y;
                if (i10 >= aVar.f14420z) {
                    int intValue = ApplicationPersistence.getInstance().getIntValue(Constants.LOCK_FAILED_ATTEMPTS);
                    ApplicationPersistence.getInstance().setLongValue(Constants.LOCK_FAILED_TIME, Calendar.getInstance().getTimeInMillis());
                    ApplicationPersistence.getInstance().setIntValue(Constants.LOCK_FAILED_ATTEMPTS, intValue + 1);
                    z10 = false;
                } else {
                    aVar.f14419y = i10 + 1;
                }
                if (z10) {
                    q0("Lock code doesn't match");
                    UtilsKt.fireAnalytics("lock_code_no_match", UtilsKt.getAnalyticsBundle());
                    return;
                }
                p0("Please try after sometime, you have exceed the max number of attempts");
                return;
            }
            i.q("lockScreenViewModel");
            throw null;
        } else {
            i.q("lockScreenViewModel");
            throw null;
        }
    }

    public final void t0() {
        int i6;
        String string;
        int i10;
        int i11;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvHeader);
            en.a aVar = this.C;
            if (aVar != null) {
                boolean z10 = this.f11302w;
                boolean z11 = this.f11303x;
                int i12 = this.f11305z;
                Application application = aVar.f2382x;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            string = "";
                        } else {
                            Context applicationContext = application.getApplicationContext();
                            if (z11) {
                                i11 = R.string.confirmPINTitle;
                            } else {
                                i11 = R.string.confirmNewPINTitle;
                            }
                            string = applicationContext.getString(i11);
                            i.f(string, "getApplication<Applicati…tring.confirmNewPINTitle)");
                        }
                    } else {
                        Context applicationContext2 = application.getApplicationContext();
                        if (z11) {
                            i10 = R.string.setPINTitle;
                        } else {
                            i10 = R.string.setNewPINTitle;
                        }
                        string = applicationContext2.getString(i10);
                        i.f(string, "getApplication<Applicati… R.string.setNewPINTitle)");
                    }
                } else {
                    Context applicationContext3 = application.getApplicationContext();
                    if (z10) {
                        i6 = R.string.enterPINTitle;
                    } else {
                        i6 = R.string.enterSecurityPINTitle;
                    }
                    string = applicationContext3.getString(i6);
                    i.f(string, "getApplication<Applicati…ng.enterSecurityPINTitle)");
                }
                robertoTextView.setText(string);
                o0();
                return;
            }
            i.q("lockScreenViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11301v, "Exception", e10);
        }
    }
}
