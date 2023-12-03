package sl;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.network.model.BookingTime;
import com.theinnerhour.b2b.network.model.DatetimeAtTimezone;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.r;
import hs.k;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import pl.w0;
import ss.l;
/* compiled from: ExpertCareFutureSessionsAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<RecyclerView.c0> {
    public String A;
    public String B;
    public String C;
    public String D;
    public final l<hs.f<? extends zl.b, ? extends Object>, k> E;
    public final l<List<? extends hs.f<? extends zl.b, ? extends Object>>, k> F;
    public final String G;
    public final int H;
    public final int I;
    public zl.a J;
    public List<? extends hs.f<? extends zl.b, ? extends Object>> K;

    /* renamed from: x  reason: collision with root package name */
    public List<? extends hs.f<? extends zl.b, ? extends Object>> f31645x;

    /* renamed from: y  reason: collision with root package name */
    public String f31646y;

    /* renamed from: z  reason: collision with root package name */
    public String f31647z;

    /* compiled from: ExpertCareFutureSessionsAdapter.kt */
    /* renamed from: sl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0539a extends RecyclerView.c0 {
        public C0539a(View view) {
            super(view);
        }
    }

    /* compiled from: ExpertCareFutureSessionsAdapter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31648a;

        static {
            int[] iArr = new int[zl.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f31648a = iArr;
            int[] iArr2 = new int[zl.a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(List list, String therapistName, String therapistImageUrl, String psychiatristName, String psychiatristImageUrl, String couplesTherapistName, String couplesTherapistImageUrl, tl.k kVar, tl.l lVar) {
        i.g(therapistName, "therapistName");
        i.g(therapistImageUrl, "therapistImageUrl");
        i.g(psychiatristName, "psychiatristName");
        i.g(psychiatristImageUrl, "psychiatristImageUrl");
        i.g(couplesTherapistName, "couplesTherapistName");
        i.g(couplesTherapistImageUrl, "couplesTherapistImageUrl");
        this.f31645x = list;
        this.f31646y = therapistName;
        this.f31647z = therapistImageUrl;
        this.A = psychiatristName;
        this.B = psychiatristImageUrl;
        this.C = couplesTherapistName;
        this.D = couplesTherapistImageUrl;
        this.E = kVar;
        this.F = lVar;
        this.G = LogHelper.INSTANCE.makeLogTag("ExpertCareFutureSessionsAdapter");
        this.H = 1;
        this.I = 2;
        this.J = zl.a.ALL;
        this.K = w.f20676u;
        try {
            List<hs.f<zl.b, Object>> y10 = y();
            this.K = y10;
            lVar.invoke(y10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.K.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        zl.b bVar;
        int i10;
        int i11 = this.I;
        try {
            hs.f fVar = (hs.f) u.j2(i6, this.K);
            if (fVar != null) {
                bVar = (zl.b) fVar.f19464u;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                i10 = -1;
            } else {
                i10 = b.f31648a[bVar.ordinal()];
            }
            switch (i10) {
                case 1:
                case 2:
                    return this.H;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return i11;
                default:
                    return -1;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
            return i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        UpcomingBooking upcomingBooking;
        String str;
        String str2;
        String str3;
        DatetimeAtTimezone datetimeAtCustomerTimezone;
        String str4;
        int i10;
        DatetimeAtTimezone datetimeAtCustomerTimezone2;
        String str5;
        String str6;
        String str7;
        String str8;
        SuggestedBooking suggestedBooking;
        boolean z10;
        String str9;
        CharSequence charSequence;
        String str10;
        String str11;
        BookingTime customerTimezoneDate;
        String str12;
        int i11;
        BookingTime customerTimezoneDate2;
        String str13;
        String str14;
        try {
            hs.f fVar = (hs.f) u.j2(i6, this.K);
            if (fVar != null) {
                B b10 = fVar.f19465v;
                A a10 = fVar.f19464u;
                zl.b bVar = zl.b.SUGGESTED_THERAPY;
                boolean Q1 = is.k.Q1(a10, new zl.b[]{bVar, zl.b.SUGGESTED_PSYCHIATRY});
                String str15 = "Therapy session with";
                String str16 = "";
                String str17 = null;
                View view = c0Var.f2751a;
                if (Q1) {
                    if (b10 instanceof SuggestedBooking) {
                        suggestedBooking = (SuggestedBooking) b10;
                    } else {
                        suggestedBooking = null;
                    }
                    if (a10 == bVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TextView textView = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionTopText);
                    if (textView != null) {
                        if (z10) {
                            str9 = "Your therapist has recommended you to book a session at";
                        } else {
                            str9 = "Your psychiatrist has recommended you to book a session at";
                        }
                        textView.setText(str9);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivRowForYouUpcomingSessionImage);
                    if (appCompatImageView != null) {
                        com.bumptech.glide.f g5 = Glide.g(view.getContext());
                        if (z10) {
                            str14 = this.f31647z;
                        } else {
                            str14 = this.B;
                        }
                        g5.p(str14).B(appCompatImageView);
                    }
                    TextView textView2 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionHeader);
                    if (textView2 != null) {
                        if (z10) {
                            charSequence = "Therapy session with";
                        } else {
                            charSequence = "Psychiatry session with";
                        }
                        textView2.setText(charSequence);
                    }
                    TextView textView3 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionProviderName);
                    if (textView3 != null) {
                        if (z10) {
                            str10 = this.f31646y;
                        } else {
                            str10 = this.A;
                        }
                        textView3.setText(str10);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.ivRowForYouUpcomingSessionType);
                    if (appCompatImageView2 != null) {
                        if (suggestedBooking != null) {
                            str13 = suggestedBooking.getMode();
                        } else {
                            str13 = null;
                        }
                        if (str13 != null) {
                            int hashCode = str13.hashCode();
                            if (hashCode != -1548612125) {
                                if (hashCode != 3322092) {
                                    if (hashCode == 112386354 && str13.equals("voice")) {
                                        appCompatImageView2.setImageResource(R.drawable.ir_provider_medium_call);
                                    }
                                } else if (str13.equals("live")) {
                                    appCompatImageView2.setImageResource(R.drawable.ir_provider_medium_video);
                                }
                            } else if (str13.equals("offline")) {
                                appCompatImageView2.setImageResource(R.drawable.ir_provider_medium_offline);
                            }
                        }
                        appCompatImageView2.setImageResource(R.drawable.ir_provider_medium_chat);
                    }
                    TextView textView4 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionDate);
                    if (textView4 != null) {
                        if (suggestedBooking != null && (customerTimezoneDate = suggestedBooking.getCustomerTimezoneDate()) != null) {
                            str11 = customerTimezoneDate.getDate();
                        } else {
                            str11 = null;
                        }
                        textView4.setText(x(str11));
                    }
                    TextView textView5 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionTime);
                    if (textView5 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (suggestedBooking != null && (customerTimezoneDate2 = suggestedBooking.getCustomerTimezoneDate()) != null) {
                            str12 = customerTimezoneDate2.getSlot();
                        } else {
                            str12 = null;
                        }
                        String v10 = v(str12);
                        if (v10 == null) {
                            v10 = "";
                        }
                        sb2.append(v10);
                        sb2.append(" | ");
                        if (suggestedBooking != null) {
                            i11 = suggestedBooking.getDuration();
                        } else {
                            i11 = 3000;
                        }
                        sb2.append(i11 / 60);
                        sb2.append(" mins");
                        textView5.setText(sb2.toString());
                    }
                    TextView textView6 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionCTA);
                    if (textView6 != null) {
                        textView6.setText("Book");
                    }
                    TextView textView7 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionBottomText);
                    if (textView7 != null) {
                        if (suggestedBooking != null) {
                            str17 = suggestedBooking.getExpiryDisplayText();
                        }
                        textView7.setText(str17);
                    }
                } else {
                    zl.b bVar2 = zl.b.UPCOMING_THERAPY;
                    zl.b bVar3 = zl.b.UPCOMING_COUPLES;
                    zl.b bVar4 = zl.b.UPCOMING_IMMEDIATE_THERAPY;
                    zl.b bVar5 = zl.b.UPCOMING_IMMEDIATE_COUPLES;
                    zl.b bVar6 = zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY;
                    if (is.k.Q1(a10, new zl.b[]{bVar2, bVar3, zl.b.UPCOMING_PSYCHIATRY, bVar4, bVar5, bVar6})) {
                        if (b10 instanceof UpcomingBooking) {
                            upcomingBooking = (UpcomingBooking) b10;
                        } else {
                            upcomingBooking = null;
                        }
                        boolean Q12 = is.k.Q1(a10, new zl.b[]{bVar3, bVar5});
                        boolean Q13 = is.k.Q1(a10, new zl.b[]{bVar2, bVar4});
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.ivRowForYouUpcomingSessionImage);
                        if (appCompatImageView3 != null) {
                            com.bumptech.glide.f g10 = Glide.g(view.getContext());
                            if (Q12) {
                                str8 = this.D;
                            } else if (Q13) {
                                str8 = this.f31647z;
                            } else {
                                str8 = this.B;
                            }
                            g10.p(str8).B(appCompatImageView3);
                        }
                        TextView textView8 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionHeader);
                        if (textView8 != null) {
                            if (Q12) {
                                str15 = "Couples therapy session with";
                            } else if (!Q13) {
                                str = "Psychiatry session with";
                                textView8.setText(str);
                            }
                            str = str15;
                            textView8.setText(str);
                        }
                        TextView textView9 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionProviderName);
                        if (textView9 != null) {
                            if (Q12) {
                                str2 = this.C;
                            } else if (Q13) {
                                str2 = this.f31646y;
                            } else {
                                str2 = this.A;
                            }
                            textView9.setText(str2);
                        }
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(R.id.ivRowForYouUpcomingSessionType);
                        if (appCompatImageView4 != null) {
                            if (upcomingBooking != null) {
                                str7 = upcomingBooking.getTypeofsession();
                            } else {
                                str7 = null;
                            }
                            if (str7 != null) {
                                int hashCode2 = str7.hashCode();
                                if (hashCode2 != -1548612125) {
                                    if (hashCode2 != 3322092) {
                                        if (hashCode2 == 112386354 && str7.equals("voice")) {
                                            appCompatImageView4.setImageResource(R.drawable.ir_provider_medium_call);
                                        }
                                    } else if (str7.equals("live")) {
                                        appCompatImageView4.setImageResource(R.drawable.ir_provider_medium_video);
                                    }
                                } else if (str7.equals("offline")) {
                                    appCompatImageView4.setImageResource(R.drawable.ir_provider_medium_offline);
                                }
                            }
                            appCompatImageView4.setImageResource(R.drawable.ir_provider_medium_chat);
                        }
                        TextView textView10 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionDate);
                        if (textView10 != null) {
                            if (upcomingBooking != null && (datetimeAtCustomerTimezone = upcomingBooking.getDatetimeAtCustomerTimezone()) != null) {
                                str3 = datetimeAtCustomerTimezone.getDate();
                            } else {
                                str3 = null;
                            }
                            textView10.setText(x(str3));
                        }
                        TextView textView11 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionTime);
                        if (textView11 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            if (upcomingBooking != null && (datetimeAtCustomerTimezone2 = upcomingBooking.getDatetimeAtCustomerTimezone()) != null) {
                                str4 = datetimeAtCustomerTimezone2.getSlot();
                            } else {
                                str4 = null;
                            }
                            String v11 = v(str4);
                            if (v11 == null) {
                                v11 = "";
                            }
                            sb3.append(v11);
                            sb3.append(" | ");
                            if (upcomingBooking != null) {
                                i10 = upcomingBooking.getDuration();
                            } else {
                                i10 = 3000;
                            }
                            sb3.append(i10 / 60);
                            sb3.append(" mins");
                            textView11.setText(sb3.toString());
                        }
                        TextView textView12 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionCTA);
                        if (textView12 != null) {
                            textView12.setText("Join");
                        }
                        if (!is.k.Q1(a10, new zl.b[]{bVar4, bVar6, bVar5})) {
                            if (upcomingBooking != null) {
                                str6 = upcomingBooking.getTypeofsession();
                            } else {
                                str6 = null;
                            }
                            if (!i.b(str6, "offline")) {
                                TextView textView13 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionCTA);
                                if (textView13 != null) {
                                    textView13.setVisibility(8);
                                }
                                View findViewById = view.findViewById(R.id.ivRowForYouUpcomingMapPin);
                                if (findViewById != null) {
                                    findViewById.setVisibility(8);
                                }
                            }
                        }
                        TextView textView14 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionCTA);
                        if (textView14 != null) {
                            textView14.setVisibility(0);
                        }
                        TextView textView15 = (TextView) view.findViewById(R.id.tvRowForYouUpcomingSessionCTA);
                        if (textView15 != null) {
                            if (upcomingBooking != null) {
                                str5 = upcomingBooking.getTypeofsession();
                            } else {
                                str5 = null;
                            }
                            if (!i.b(str5, "offline")) {
                                str16 = "JOIN";
                            }
                            textView15.setText(str16);
                        }
                        if (upcomingBooking != null) {
                            str17 = upcomingBooking.getTypeofsession();
                        }
                        if (i.b(str17, "offline")) {
                            View findViewById2 = view.findViewById(R.id.ivRowForYouUpcomingMapPin);
                            if (findViewById2 != null) {
                                findViewById2.setVisibility(0);
                            }
                        } else {
                            View findViewById3 = view.findViewById(R.id.ivRowForYouUpcomingMapPin);
                            if (findViewById3 != null) {
                                findViewById3.setVisibility(8);
                            }
                        }
                    }
                }
                view.setOnClickListener(new w0(this, 1, fVar));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.H) {
            return new C0539a(defpackage.e.h(parent, R.layout.row_for_you_suggested_session, parent, false, "from(parent.context).inf…d_session, parent, false)"));
        }
        if (i6 == this.I) {
            return new C0539a(defpackage.e.h(parent, R.layout.row_for_you_upcoming_session, parent, false, "from(parent.context).inf…g_session, parent, false)"));
        }
        return new C0539a(defpackage.e.h(parent, R.layout.row_for_you_suggested_session, parent, false, "from(parent.context).inf…d_session, parent, false)"));
    }

    public final String v(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        try {
            String substring = str.substring(0, 2);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (parseInt >= 12) {
                if (parseInt != 12) {
                    parseInt -= 12;
                }
                str2 = "PM";
            } else {
                if (parseInt == 0) {
                    parseInt = 12;
                }
                str2 = "AM";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(parseInt);
            String substring2 = str.substring(2);
            i.f(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring2);
            sb2.append(' ');
            sb2.append(str2);
            return sb2.toString();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
            return "";
        }
    }

    public final void w() {
        List<hs.f<zl.b, Object>> list;
        try {
            if (this.J == zl.a.ALL) {
                list = y();
            } else {
                List<? extends hs.f<? extends zl.b, ? extends Object>> list2 = this.f31645x;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    hs.f fVar = (hs.f) obj;
                    int ordinal = this.J.ordinal();
                    boolean z10 = false;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                z10 = is.k.Q1(fVar.f19464u, new zl.b[]{zl.b.UPCOMING_COUPLES, zl.b.UPCOMING_IMMEDIATE_COUPLES});
                            }
                        } else {
                            z10 = is.k.Q1(fVar.f19464u, new zl.b[]{zl.b.SUGGESTED_PSYCHIATRY, zl.b.UPCOMING_PSYCHIATRY, zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY});
                        }
                    } else {
                        z10 = is.k.Q1(fVar.f19464u, new zl.b[]{zl.b.SUGGESTED_THERAPY, zl.b.UPCOMING_THERAPY, zl.b.UPCOMING_IMMEDIATE_THERAPY});
                    }
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            this.K = list;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014e A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:5:0x0005, B:16:0x0062, B:20:0x006e, B:21:0x0071, B:94:0x015b, B:50:0x00d0, B:54:0x00de, B:58:0x00ec, B:62:0x00fa, B:66:0x0106, B:70:0x0112, B:74:0x011e, B:78:0x012a, B:82:0x0136, B:23:0x0076, B:26:0x0080, B:29:0x008a, B:32:0x0094, B:35:0x009e, B:38:0x00a8, B:41:0x00b2, B:44:0x00bc, B:47:0x00c6, B:86:0x0142, B:90:0x014e, B:8:0x004b), top: B:99:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String x(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        int hashCode;
        String str6;
        if (str == null) {
            return "";
        }
        try {
            String[] strArr = (String[]) r.a1(str, new String[]{"-"}, 0, 6).toArray(new String[0]);
            str2 = strArr[0];
            str3 = strArr[1];
            str4 = strArr[2];
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
            return str;
        }
        if (!is.k.Q1(Integer.valueOf(Integer.parseInt(str4)), new Integer[]{11, 12, 13})) {
            int parseInt = Integer.parseInt(str4) % 10;
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        str5 = "rd";
                    }
                } else {
                    str5 = "nd";
                }
            } else {
                str5 = "st";
            }
            hashCode = str3.hashCode();
            if (hashCode == 1567) {
                if (hashCode != 1568) {
                    switch (hashCode) {
                        case com.appsflyer.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            if (!str3.equals("1")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Jan";
                            break;
                        case 50:
                            if (!str3.equals("2")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Feb";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (!str3.equals("3")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Mar";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (!str3.equals("4")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Apr";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (!str3.equals("5")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "May";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (!str3.equals("6")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Jun";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (!str3.equals("7")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Jul";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (!str3.equals("8")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Aug";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (!str3.equals("9")) {
                                str6 = "Dec";
                                break;
                            }
                            str6 = "Sep";
                            break;
                        default:
                            switch (hashCode) {
                                case 1537:
                                    if (!str3.equals("01")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Jan";
                                    break;
                                case 1538:
                                    if (!str3.equals("02")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Feb";
                                    break;
                                case 1539:
                                    if (!str3.equals("03")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Mar";
                                    break;
                                case 1540:
                                    if (!str3.equals("04")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Apr";
                                    break;
                                case 1541:
                                    if (!str3.equals("05")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "May";
                                    break;
                                case 1542:
                                    if (!str3.equals("06")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Jun";
                                    break;
                                case 1543:
                                    if (!str3.equals("07")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Jul";
                                    break;
                                case 1544:
                                    if (!str3.equals("08")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Aug";
                                    break;
                                case 1545:
                                    if (!str3.equals("09")) {
                                        str6 = "Dec";
                                        break;
                                    }
                                    str6 = "Sep";
                                    break;
                                default:
                                    str6 = "Dec";
                                    break;
                            }
                    }
                    return Integer.parseInt(str4) + str5 + ' ' + str6 + ", " + str2;
                } else if (str3.equals("11")) {
                    str6 = "Nov";
                    return Integer.parseInt(str4) + str5 + ' ' + str6 + ", " + str2;
                } else {
                    str6 = "Dec";
                    return Integer.parseInt(str4) + str5 + ' ' + str6 + ", " + str2;
                }
            }
            if (str3.equals("10")) {
                str6 = "Oct";
                return Integer.parseInt(str4) + str5 + ' ' + str6 + ", " + str2;
            }
            str6 = "Dec";
            return Integer.parseInt(str4) + str5 + ' ' + str6 + ", " + str2;
            LogHelper.INSTANCE.e(this.G, e10);
            return str;
        }
        str5 = "th";
        hashCode = str3.hashCode();
        if (hashCode == 1567) {
        }
        LogHelper.INSTANCE.e(this.G, e10);
        return str;
    }

    public final List<hs.f<zl.b, Object>> y() {
        try {
            List<? extends hs.f<? extends zl.b, ? extends Object>> list = this.f31645x;
            ArrayList arrayList = new ArrayList();
            int i6 = -1;
            for (Object obj : list) {
                boolean z10 = false;
                if ((!is.k.Q1(((hs.f) obj).f19464u, new zl.b[]{zl.b.UPCOMING_THERAPY, zl.b.UPCOMING_COUPLES, zl.b.UPCOMING_PSYCHIATRY}) || (i6 = i6 + 1) < 3) ? true : true) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.G, e10);
            return w.f20676u;
        }
    }

    public final int z(zl.a aVar) {
        if (aVar != null) {
            try {
                this.J = aVar;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.G, e10);
                return 0;
            }
        }
        w();
        i();
        if (this.J == zl.a.ALL) {
            this.F.invoke(this.K);
        }
        return this.K.size();
    }
}
