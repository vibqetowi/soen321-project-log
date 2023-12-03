package g6;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.k;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.google.zxing.WriterException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import g6.p;
import h5.g0;
import h5.q;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.e0;
import w5.f0;
import w5.i0;
/* compiled from: DeviceAuthDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lg6/h;", "Landroidx/fragment/app/n;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "c", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.n {
    public static final /* synthetic */ int F = 0;
    public volatile ScheduledFuture<?> A;
    public volatile c B;
    public boolean C;
    public boolean D;
    public p.d E;

    /* renamed from: u  reason: collision with root package name */
    public View f16264u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f16265v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f16266w;

    /* renamed from: x  reason: collision with root package name */
    public i f16267x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f16268y = new AtomicBoolean();

    /* renamed from: z  reason: collision with root package name */
    public volatile h5.s f16269z;

    /* compiled from: DeviceAuthDialog.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final b a(JSONObject jSONObject) {
            boolean z10;
            String optString;
            int i6 = h.F;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String permission = optJSONObject.optString("permission");
                    kotlin.jvm.internal.i.f(permission, "permission");
                    if (permission.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !kotlin.jvm.internal.i.b(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16270a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f16271b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f16272c;

        public b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f16270a = arrayList;
            this.f16271b = arrayList2;
            this.f16272c = arrayList3;
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    /* loaded from: classes.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public String f16273u;

        /* renamed from: v  reason: collision with root package name */
        public String f16274v;

        /* renamed from: w  reason: collision with root package name */
        public String f16275w;

        /* renamed from: x  reason: collision with root package name */
        public long f16276x;

        /* renamed from: y  reason: collision with root package name */
        public long f16277y;

        /* compiled from: DeviceAuthDialog.kt */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.g(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i6) {
                return new c[i6];
            }
        }

        public c() {
        }

        public c(Parcel parcel) {
            kotlin.jvm.internal.i.g(parcel, "parcel");
            this.f16273u = parcel.readString();
            this.f16274v = parcel.readString();
            this.f16275w = parcel.readString();
            this.f16276x = parcel.readLong();
            this.f16277y = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i6) {
            kotlin.jvm.internal.i.g(dest, "dest");
            dest.writeString(this.f16273u);
            dest.writeString(this.f16274v);
            dest.writeString(this.f16275w);
            dest.writeLong(this.f16276x);
            dest.writeLong(this.f16277y);
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    /* loaded from: classes.dex */
    public static final class d extends Dialog {
        public d(androidx.fragment.app.p pVar) {
            super(pVar, R.style.com_facebook_auth_dialog);
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            h.this.getClass();
            super.onBackPressed();
        }
    }

    static {
        new a();
    }

    public static String I() {
        StringBuilder sb2 = new StringBuilder();
        String str = f0.f36461a;
        sb2.append(h5.p.b());
        sb2.append('|');
        f0.e();
        String str2 = h5.p.f;
        if (str2 != null) {
            sb2.append(str2);
            return sb2.toString();
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public final void F(String str, b bVar, String str2, Date date, Date date2) {
        i iVar = this.f16267x;
        if (iVar != null) {
            iVar.d().d(new p.e(iVar.d().A, p.e.a.SUCCESS, new h5.a(str2, h5.p.b(), str, bVar.f16270a, bVar.f16271b, bVar.f16272c, h5.g.DEVICE_AUTH, date, null, date2), null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View J(boolean z10) {
        int i6;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.i.f(layoutInflater, "requireActivity().layoutInflater");
        if (z10) {
            i6 = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i6 = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i6, (ViewGroup) null);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f16264u = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        if (findViewById2 != null) {
            this.f16265v = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new i0(1, this));
                View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.f16266w = textView;
                    textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void K() {
        if (!this.f16268y.compareAndSet(false, true)) {
            return;
        }
        c cVar = this.B;
        if (cVar != null) {
            v5.a aVar = v5.a.f34812a;
            v5.a.a(cVar.f16274v);
        }
        i iVar = this.f16267x;
        if (iVar != null) {
            iVar.d().d(new p.e(iVar.d().A, p.e.a.CANCEL, null, "User canceled log in.", null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void M(FacebookException facebookException) {
        if (!this.f16268y.compareAndSet(false, true)) {
            return;
        }
        c cVar = this.B;
        if (cVar != null) {
            v5.a aVar = v5.a.f34812a;
            v5.a.a(cVar.f16274v);
        }
        i iVar = this.f16267x;
        if (iVar != null) {
            p.d dVar = iVar.d().A;
            String message = facebookException.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            iVar.d().d(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void O(String str, long j10, Long l2) {
        Date date;
        Bundle a10 = r1.b0.a("fields", "id,permissions,name");
        Date date2 = null;
        if (j10 != 0) {
            date = new Date((j10 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l2 == null || l2.longValue() != 0) && l2 != null) {
            date2 = new Date(l2.longValue() * 1000);
        }
        h5.a aVar = new h5.a(str, h5.p.b(), "0", null, null, null, null, date, null, date2);
        String str2 = h5.q.f17287j;
        h5.q g5 = q.c.g(aVar, "me", new h5.c(this, str, date, date2, 2));
        g5.k(h5.v.GET);
        g5.f17293d = a10;
        g5.d();
    }

    public final void P() {
        String str;
        c cVar = this.B;
        if (cVar != null) {
            cVar.f16277y = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        c cVar2 = this.B;
        if (cVar2 == null) {
            str = null;
        } else {
            str = cVar2.f16275w;
        }
        bundle.putString("code", str);
        bundle.putString("access_token", I());
        String str2 = h5.q.f17287j;
        this.f16269z = q.c.i("device/login_status", bundle, new e(this, 0)).d();
    }

    public final void Q() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        c cVar = this.B;
        if (cVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(cVar.f16276x);
        }
        if (valueOf != null) {
            synchronized (i.f16279x) {
                if (i.f16280y == null) {
                    i.f16280y = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = i.f16280y;
                if (scheduledThreadPoolExecutor == null) {
                    kotlin.jvm.internal.i.q("backgroundExecutor");
                    throw null;
                }
            }
            this.A = scheduledThreadPoolExecutor.schedule(new androidx.activity.b(16, this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(c cVar) {
        Bitmap createBitmap;
        int i6;
        TextView textView;
        boolean d10;
        this.B = cVar;
        TextView textView2 = this.f16265v;
        if (textView2 != null) {
            textView2.setText(cVar.f16274v);
            v5.a aVar = v5.a.f34812a;
            String str = cVar.f16273u;
            boolean z10 = false;
            if (!b6.a.b(v5.a.class)) {
                try {
                    EnumMap enumMap = new EnumMap(bg.c.class);
                    enumMap.put((EnumMap) bg.c.MARGIN, (bg.c) 2);
                    try {
                        dg.b O = new f6.b().O(str, bg.a.QR_CODE, k.d.DEFAULT_DRAG_ANIMATION_DURATION, k.d.DEFAULT_DRAG_ANIMATION_DURATION, enumMap);
                        int i10 = O.f12847v;
                        int i11 = O.f12846u;
                        int[] iArr = new int[i10 * i11];
                        if (i10 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                int i14 = i12 * i11;
                                if (i11 > 0) {
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = i15 + 1;
                                        int i17 = i14 + i15;
                                        if (O.a(i15, i12)) {
                                            i6 = -16777216;
                                        } else {
                                            i6 = -1;
                                        }
                                        iArr[i17] = i6;
                                        if (i16 >= i11) {
                                            break;
                                        }
                                        i15 = i16;
                                    }
                                }
                                if (i13 >= i10) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                        createBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i10);
                        } catch (WriterException unused) {
                        }
                    } catch (WriterException unused2) {
                    }
                } catch (Throwable th2) {
                    b6.a.a(v5.a.class, th2);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
                textView = this.f16266w;
                if (textView == null) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
                    TextView textView3 = this.f16265v;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        View view = this.f16264u;
                        if (view != null) {
                            view.setVisibility(8);
                            if (!this.D) {
                                v5.a aVar2 = v5.a.f34812a;
                                String str2 = cVar.f16274v;
                                if (!b6.a.b(v5.a.class)) {
                                    try {
                                    } catch (Throwable th3) {
                                        b6.a.a(v5.a.class, th3);
                                    }
                                    if (v5.a.c()) {
                                        d10 = v5.a.f34812a.d(str2);
                                        if (d10) {
                                            i5.i iVar = new i5.i(getContext(), (String) null);
                                            h5.p pVar = h5.p.f17269a;
                                            if (g0.b()) {
                                                iVar.f("fb_smart_login_service", null);
                                            }
                                        }
                                    }
                                }
                                d10 = false;
                                if (d10) {
                                }
                            }
                            if (cVar.f16277y != 0 && (new Date().getTime() - cVar.f16277y) - (cVar.f16276x * 1000) < 0) {
                                z10 = true;
                            }
                            if (z10) {
                                Q();
                                return;
                            } else {
                                P();
                                return;
                            }
                        }
                        kotlin.jvm.internal.i.q("progressBar");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("confirmationCode");
                    throw null;
                }
                kotlin.jvm.internal.i.q("instructions");
                throw null;
            }
            createBitmap = null;
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), createBitmap);
            textView = this.f16266w;
            if (textView == null) {
            }
        } else {
            kotlin.jvm.internal.i.q("confirmationCode");
            throw null;
        }
    }

    public final void U(p.d dVar) {
        String jSONObject;
        this.E = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.f16303v));
        e0 e0Var = e0.f36453a;
        String str = dVar.A;
        if (!e0.A(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = dVar.C;
        if (!e0.A(str2)) {
            bundle.putString("target_user_id", str2);
        }
        bundle.putString("access_token", I());
        v5.a aVar = v5.a.f34812a;
        if (!b6.a.b(v5.a.class)) {
            try {
                HashMap hashMap = new HashMap();
                String DEVICE = Build.DEVICE;
                kotlin.jvm.internal.i.f(DEVICE, "DEVICE");
                hashMap.put("device", DEVICE);
                String MODEL = Build.MODEL;
                kotlin.jvm.internal.i.f(MODEL, "MODEL");
                hashMap.put("model", MODEL);
                jSONObject = new JSONObject(hashMap).toString();
                kotlin.jvm.internal.i.f(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
            } catch (Throwable th2) {
                b6.a.a(v5.a.class, th2);
            }
            bundle.putString("device_info", jSONObject);
            String str3 = h5.q.f17287j;
            q.c.i("device/login", bundle, new e(this, 1)).d();
        }
        jSONObject = null;
        bundle.putString("device_info", jSONObject);
        String str32 = h5.q.f17287j;
        q.c.i("device/login", bundle, new e(this, 1)).d();
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z10;
        d dVar = new d(requireActivity());
        if (v5.a.c() && !this.D) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setContentView(J(z10));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        y f;
        c cVar;
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        r rVar = (r) ((FacebookActivity) requireActivity()).f6105u;
        if (rVar == null) {
            f = null;
        } else {
            f = rVar.F().f();
        }
        this.f16267x = (i) f;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            S(cVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.C = true;
        this.f16268y.set(true);
        super.onDestroyView();
        h5.s sVar = this.f16269z;
        if (sVar != null) {
            sVar.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.i.g(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.C) {
            K();
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.g(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.B != null) {
            outState.putParcelable("request_state", this.B);
        }
    }
}
