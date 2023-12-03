package i7;

import a7.h;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import c9.j;
import com.appsflyer.AppsFlyerLib;
import com.bumptech.glide.Glide;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.protobuf.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import d7.h;
import d7.n;
import d7.s;
import dk.t;
import g7.a;
import g7.c;
import g7.f;
import ik.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import je.a1;
import je.b1;
import je.c0;
import je.k;
import k7.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import l7.a;
import nd.b0;
import nd.o0;
import ne.a0;
import oe.l;
import p.a;
import tk.g;
import tk.m;
import tk.q;
import tk.r;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements a.InterfaceC0377a, o.a, j.a, h, l, ya.b, a.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19894u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f19895v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f19896w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f19897x;

    public /* synthetic */ a(int i6, Object obj, Object obj2, Object obj3) {
        this.f19894u = i6;
        this.f19897x = obj;
        this.f19896w = obj2;
        this.f19895v = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_WORRY) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_SLEEP) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_ANGER) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_STRESS) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_DEPRESSION) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        r2 = r10.a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r2.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
        r15 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (kotlin.jvm.internal.i.b(((vk.b) r15).c(), "living-with-depression") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        r15 = (vk.b) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r15 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r1 = (com.theinnerhour.b2b.widgets.RobertoTextView) r20.findViewById(com.theinnerhour.b2b.R.id.tvCardV4DomainName);
        r2 = java.lang.String.valueOf(r15.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
        if (r2.length() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
        if (r14 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
        r14 = new java.lang.StringBuilder();
        r11 = java.lang.String.valueOf(r2.charAt(0));
        kotlin.jvm.internal.i.e(r11, "null cannot be cast to non-null type java.lang.String");
        r6 = r11.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.i.f(r6, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        r14.append((java.lang.Object) r6);
        r2 = r2.substring(1);
        kotlin.jvm.internal.i.f(r2, "this as java.lang.String).substring(startIndex)");
        r14.append(r2);
        r2 = r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
        r1.setText(r2);
        r1 = com.bumptech.glide.Glide.c(r9).c(r9).a();
        r1.Z = r15.a();
        r1.f5953b0 = true;
        r1.B((androidx.appcompat.widget.AppCompatImageView) r20.findViewById(com.theinnerhour.b2b.R.id.ivCardV4DomainImage));
        r12.A = "living-with-depression";
        r1 = r15.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0152, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
        r12.f33176z = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
        if (r2.equals(com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0162, code lost:
        r1 = r10.a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
        if (r1.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0172, code lost:
        r2 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0181, code lost:
        if (kotlin.jvm.internal.i.b(((vk.b) r2).c(), "coping-with-anxiety") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0183, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0186, code lost:
        r15 = (vk.b) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0188, code lost:
        if (r15 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
        r1 = (com.theinnerhour.b2b.widgets.RobertoTextView) r20.findViewById(com.theinnerhour.b2b.R.id.tvCardV4DomainName);
        r2 = java.lang.String.valueOf(r15.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019c, code lost:
        if (r2.length() <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019e, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a0, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a3, code lost:
        r14 = new java.lang.StringBuilder();
        r11 = java.lang.String.valueOf(r2.charAt(0));
        kotlin.jvm.internal.i.e(r11, "null cannot be cast to non-null type java.lang.String");
        r6 = r11.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.i.f(r6, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        r14.append((java.lang.Object) r6);
        r2 = r2.substring(1);
        kotlin.jvm.internal.i.f(r2, "this as java.lang.String).substring(startIndex)");
        r14.append(r2);
        r2 = r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ce, code lost:
        r1.setText(r2);
        r1 = com.bumptech.glide.Glide.c(r9).c(r9).a();
        r1.Z = r15.a();
        r1.f5953b0 = true;
        r1.B((androidx.appcompat.widget.AppCompatImageView) r20.findViewById(com.theinnerhour.b2b.R.id.ivCardV4DomainImage));
        r12.A = "coping-with-anxiety";
        r1 = r15.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
        r12.f33176z = r1;
     */
    @Override // p.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View v10, ViewGroup viewGroup) {
        boolean z10;
        boolean z11;
        String str;
        int i6 = this.f19894u;
        Object obj = this.f19895v;
        Object obj2 = this.f19896w;
        Object obj3 = this.f19897x;
        boolean z12 = false;
        switch (i6) {
            case 9:
                Context this_labelContext = (Context) obj3;
                tk.c this$0 = (tk.c) obj2;
                vk.d dVar = (vk.d) obj;
                i.g(this_labelContext, "$this_labelContext");
                i.g(this$0, "this$0");
                i.g(v10, "v");
                ((RecyclerView) v10.findViewById(R.id.rvCommunityCardV3)).setLayoutManager(new LinearLayoutManager(this_labelContext, 0, false));
                ArrayList<vk.c> a10 = dVar.a();
                Boolean bool = this$0.C;
                if (bool != null) {
                    z12 = bool.booleanValue();
                }
                this$0.F = new el.b(this_labelContext, a10, z12, !this$0.D.isEmpty());
                ((RecyclerView) v10.findViewById(R.id.rvCommunityCardV3)).setAdapter(this$0.F);
                new w().a((RecyclerView) v10.findViewById(R.id.rvCommunityCardV3));
                v vVar = new v();
                vVar.f23467u = -1;
                ((RecyclerView) v10.findViewById(R.id.rvCommunityCardV3)).i(new tk.l(this$0, v10, vVar));
                RobertoButton robertoButton = (RobertoButton) v10.findViewById(R.id.rbCommunityCardV3JoinButton);
                if (robertoButton != null) {
                    robertoButton.setOnClickListener(new tk.e(this$0, 3));
                }
                if (dVar.a().size() > 0) {
                    v vVar2 = new v();
                    vVar2.f23467u = 1;
                    Timer timer = this$0.f33175y;
                    if (timer != null) {
                        timer.scheduleAtFixedRate(new m(this$0, vVar2, dVar, v10), 5000L, 5000L);
                    }
                }
                RecyclerView recyclerView = (RecyclerView) v10.findViewById(R.id.rvCommunityCardV3);
                if (recyclerView != null) {
                    recyclerView.post(new g(v10, this$0, 1));
                }
                if (viewGroup != null) {
                    viewGroup.addView(v10);
                    return;
                }
                return;
            case 10:
                vk.a aVar = (vk.a) obj3;
                Context this_labelContext2 = (Context) obj2;
                tk.c this$02 = (tk.c) obj;
                i.g(this_labelContext2, "$this_labelContext");
                i.g(this$02, "this$0");
                i.g(v10, "v");
                u uVar = new u();
                SpannableString spannableString = new SpannableString(this_labelContext2.getString(R.string.community_card_v4_title));
                spannableString.setSpan(new r(this_labelContext2), 14, 24, 33);
                ((RobertoTextView) v10.findViewById(R.id.tvCardV4Title)).setText(spannableString);
                if (this$02.f33176z.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2114782937:
                                break;
                            case -1617042330:
                                break;
                            case -891989580:
                                break;
                            case 92960775:
                                break;
                            case 109522647:
                                break;
                            case 113319009:
                                break;
                        }
                    }
                } else {
                    for (vk.b bVar : aVar.a()) {
                        if (i.b(bVar.b(), this$02.f33176z)) {
                            RobertoTextView robertoTextView = (RobertoTextView) v10.findViewById(R.id.tvCardV4DomainName);
                            String valueOf = String.valueOf(bVar.b());
                            if (valueOf.length() > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                StringBuilder sb2 = new StringBuilder();
                                String valueOf2 = String.valueOf(valueOf.charAt(0));
                                i.e(valueOf2, "null cannot be cast to non-null type java.lang.String");
                                String upperCase = valueOf2.toUpperCase(Locale.ROOT);
                                i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                sb2.append((Object) upperCase);
                                String substring = valueOf.substring(1);
                                i.f(substring, "this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                valueOf = sb2.toString();
                            }
                            robertoTextView.setText(valueOf);
                            com.bumptech.glide.e<Bitmap> a11 = Glide.c(this_labelContext2).c(this_labelContext2).a();
                            a11.Z = bVar.a();
                            a11.f5953b0 = true;
                            a11.B((AppCompatImageView) v10.findViewById(R.id.ivCardV4DomainImage));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                ((ConstraintLayout) v10.findViewById(R.id.clDomainSelectionContainer)).setOnClickListener(new t(5, aVar, this$02, v10));
                ((AppCompatImageView) v10.findViewById(R.id.ivCardV4SendAnonymouslyCheckBox)).setOnClickListener(new q(uVar, v10, this_labelContext2, this$02, 0));
                ((ConstraintLayout) v10.findViewById(R.id.clShareCommunityContainer)).setOnClickListener(new j1(this$02, 5, uVar));
                if (viewGroup != null) {
                    viewGroup.addView(v10);
                    return;
                }
                return;
            default:
                final List communitiesGroupData = (List) obj3;
                final Context this_checkIfFragmentAttached = (Context) obj2;
                final tk.c this$03 = (tk.c) obj;
                i.g(communitiesGroupData, "$communitiesGroupData");
                i.g(this_checkIfFragmentAttached, "$this_checkIfFragmentAttached");
                i.g(this$03, "this$0");
                i.g(v10, "v");
                v10.findViewById(R.id.CommunitiesCard1View).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener() { // from class: tk.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r4;
                        List communitiesGroupData2 = communitiesGroupData;
                        c this$04 = this$03;
                        Context this_checkIfFragmentAttached2 = this_checkIfFragmentAttached;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.i.g(this_checkIfFragmentAttached2, "$this_checkIfFragmentAttached");
                                kotlin.jvm.internal.i.g(this$04, "this$0");
                                kotlin.jvm.internal.i.g(communitiesGroupData2, "$communitiesGroupData");
                                if (Utils.INSTANCE.checkConnectivity(this_checkIfFragmentAttached2)) {
                                    String str2 = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                    bundle.putBoolean("group_joined", !communitiesGroupData2.isEmpty());
                                    bundle.putString(Constants.DAYMODEL_POSITION, "a");
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle, "communities_db_card_click");
                                    if (new gk.e().a()) {
                                        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                                        Context applicationContext = this_checkIfFragmentAttached2.getApplicationContext();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                        hashMap.put("group_joined", Boolean.valueOf(!communitiesGroupData2.isEmpty()));
                                        hashMap.put(Constants.DAYMODEL_POSITION, "a");
                                        appsFlyerLib.logEvent(applicationContext, "communities_db_card_click", hashMap);
                                    }
                                    xk.a aVar2 = this$04.H;
                                    if (aVar2 != null) {
                                        aVar2.E(null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this_checkIfFragmentAttached2, "$this_checkIfFragmentAttached");
                                kotlin.jvm.internal.i.g(this$04, "this$0");
                                kotlin.jvm.internal.i.g(communitiesGroupData2, "$communitiesGroupData");
                                if (Utils.INSTANCE.checkConnectivity(this_checkIfFragmentAttached2)) {
                                    String str3 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                    bundle2.putBoolean("group_joined", !communitiesGroupData2.isEmpty());
                                    bundle2.putString(Constants.DAYMODEL_POSITION, "a");
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle2, "communities_db_card_click");
                                    if (new gk.e().a()) {
                                        AppsFlyerLib appsFlyerLib2 = AppsFlyerLib.getInstance();
                                        Context applicationContext2 = this_checkIfFragmentAttached2.getApplicationContext();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                        hashMap2.put("group_joined", Boolean.valueOf(!communitiesGroupData2.isEmpty()));
                                        hashMap2.put(Constants.DAYMODEL_POSITION, "a");
                                        appsFlyerLib2.logEvent(applicationContext2, "communities_db_card_click", hashMap2);
                                    }
                                    xk.a aVar3 = this$04.H;
                                    if (aVar3 != null) {
                                        aVar3.E(null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }));
                v10.findViewById(R.id.CommunitiesCard2View).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener() { // from class: tk.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r4;
                        List communitiesGroupData2 = communitiesGroupData;
                        c this$04 = this$03;
                        Context this_checkIfFragmentAttached2 = this_checkIfFragmentAttached;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.i.g(this_checkIfFragmentAttached2, "$this_checkIfFragmentAttached");
                                kotlin.jvm.internal.i.g(this$04, "this$0");
                                kotlin.jvm.internal.i.g(communitiesGroupData2, "$communitiesGroupData");
                                if (Utils.INSTANCE.checkConnectivity(this_checkIfFragmentAttached2)) {
                                    String str2 = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                    bundle.putBoolean("group_joined", !communitiesGroupData2.isEmpty());
                                    bundle.putString(Constants.DAYMODEL_POSITION, "a");
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle, "communities_db_card_click");
                                    if (new gk.e().a()) {
                                        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                                        Context applicationContext = this_checkIfFragmentAttached2.getApplicationContext();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                        hashMap.put("group_joined", Boolean.valueOf(!communitiesGroupData2.isEmpty()));
                                        hashMap.put(Constants.DAYMODEL_POSITION, "a");
                                        appsFlyerLib.logEvent(applicationContext, "communities_db_card_click", hashMap);
                                    }
                                    xk.a aVar2 = this$04.H;
                                    if (aVar2 != null) {
                                        aVar2.E(null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this_checkIfFragmentAttached2, "$this_checkIfFragmentAttached");
                                kotlin.jvm.internal.i.g(this$04, "this$0");
                                kotlin.jvm.internal.i.g(communitiesGroupData2, "$communitiesGroupData");
                                if (Utils.INSTANCE.checkConnectivity(this_checkIfFragmentAttached2)) {
                                    String str3 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                    bundle2.putBoolean("group_joined", !communitiesGroupData2.isEmpty());
                                    bundle2.putString(Constants.DAYMODEL_POSITION, "a");
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle2, "communities_db_card_click");
                                    if (new gk.e().a()) {
                                        AppsFlyerLib appsFlyerLib2 = AppsFlyerLib.getInstance();
                                        Context applicationContext2 = this_checkIfFragmentAttached2.getApplicationContext();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                        hashMap2.put("group_joined", Boolean.valueOf(!communitiesGroupData2.isEmpty()));
                                        hashMap2.put(Constants.DAYMODEL_POSITION, "a");
                                        appsFlyerLib2.logEvent(applicationContext2, "communities_db_card_click", hashMap2);
                                    }
                                    xk.a aVar3 = this$04.H;
                                    if (aVar3 != null) {
                                        aVar3.E(null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }));
                if (communitiesGroupData.isEmpty()) {
                    View findViewById = v10.findViewById(R.id.CommunitiesCard1View);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    View findViewById2 = v10.findViewById(R.id.CommunitiesCard2View);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                } else {
                    View findViewById3 = v10.findViewById(R.id.CommunitiesCard1View);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(8);
                    }
                    View findViewById4 = v10.findViewById(R.id.CommunitiesCard2View);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(0);
                    }
                }
                if (viewGroup != null) {
                    viewGroup.addView(v10);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x031a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0312  */
    @Override // k7.o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        c.a aVar;
        boolean z10;
        long insert;
        boolean z11;
        byte[] bArr;
        boolean z12;
        a7.b bVar;
        a7.b bVar2;
        c.a aVar2 = c.a.CACHE_FULL;
        int i6 = 0;
        int i10 = 5;
        int i11 = 3;
        int i12 = 4;
        int i13 = this.f19894u;
        Object obj2 = this.f19896w;
        Object obj3 = this.f19895v;
        Object obj4 = this.f19897x;
        int i14 = 1;
        switch (i13) {
            case 1:
                o oVar = (o) obj4;
                n nVar = (n) obj3;
                s sVar = (s) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                a7.b bVar3 = o.f23051z;
                long simpleQueryForLong = oVar.j().compileStatement("PRAGMA page_size").simpleQueryForLong() * oVar.j().compileStatement("PRAGMA page_count").simpleQueryForLong();
                k7.e eVar = oVar.f23055x;
                if (simpleQueryForLong >= eVar.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    oVar.g(1L, aVar2, nVar.g());
                    return -1L;
                }
                Long m10 = o.m(sQLiteDatabase, sVar);
                if (m10 != null) {
                    insert = m10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", sVar.b());
                    contentValues.put("priority", Integer.valueOf(n7.a.a(sVar.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (sVar.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d10 = eVar.d();
                byte[] bArr2 = nVar.d().f12254b;
                if (bArr2.length <= d10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", nVar.g());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
                contentValues2.put("payload_encoding", nVar.d().f12253a.f333a);
                contentValues2.put("code", nVar.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z11));
                if (z11) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z11) {
                    int ceil = (int) Math.ceil(bArr2.length / d10);
                    while (i14 <= ceil) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i14 - 1) * d10, Math.min(i14 * d10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i14));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                        i14++;
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(nVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put(SessionManager.KEY_NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                o oVar2 = (o) obj4;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                a7.b bVar4 = o.f23051z;
                oVar2.getClass();
                sQLiteDatabase2.compileStatement((String) obj2).execute();
                o.J(sQLiteDatabase2.rawQuery((String) obj3, null), new k7.l(oVar2, 2));
                sQLiteDatabase2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 3:
                o oVar3 = (o) obj4;
                List list = (List) obj3;
                s sVar2 = (s) obj2;
                Cursor cursor = (Cursor) obj;
                a7.b bVar5 = o.f23051z;
                oVar3.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(i6);
                    if (cursor.getInt(7) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h.a aVar3 = new h.a();
                    aVar3.f = new HashMap();
                    aVar3.d(cursor.getString(1));
                    aVar3.f12234d = Long.valueOf(cursor.getLong(2));
                    aVar3.f12235e = Long.valueOf(cursor.getLong(i11));
                    if (z12) {
                        String string = cursor.getString(i12);
                        if (string == null) {
                            bVar2 = o.f23051z;
                        } else {
                            bVar2 = new a7.b(string);
                        }
                        aVar3.c(new d7.m(bVar2, cursor.getBlob(i10)));
                    } else {
                        String string2 = cursor.getString(i12);
                        if (string2 == null) {
                            bVar = o.f23051z;
                        } else {
                            bVar = new a7.b(string2);
                        }
                        aVar3.c(new d7.m(bVar, (byte[]) o.J(oVar3.j().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new p7.b(27))));
                    }
                    if (!cursor.isNull(6)) {
                        aVar3.f12232b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new k7.b(j10, sVar2, aVar3.b()));
                    i6 = 0;
                    i10 = 5;
                    i11 = 3;
                    i12 = 4;
                }
                return null;
            default:
                o oVar4 = (o) obj4;
                Map map = (Map) obj2;
                a.C0246a c0246a = (a.C0246a) obj3;
                Cursor cursor2 = (Cursor) obj;
                a7.b bVar6 = o.f23051z;
                oVar4.getClass();
                while (cursor2.moveToNext()) {
                    String string3 = cursor2.getString(0);
                    int i15 = cursor2.getInt(i14);
                    c.a aVar4 = c.a.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == i14) {
                            aVar = c.a.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            aVar = aVar2;
                        } else if (i15 == 3) {
                            aVar = c.a.PAYLOAD_TOO_BIG;
                            long j11 = cursor2.getLong(2);
                            if (!map.containsKey(string3)) {
                                map.put(string3, new ArrayList());
                            }
                            ((List) map.get(string3)).add(new g7.c(j11, aVar));
                            i14 = 1;
                        } else if (i15 == 4) {
                            aVar = c.a.MAX_RETRIES_REACHED;
                            long j112 = cursor2.getLong(2);
                            if (!map.containsKey(string3)) {
                            }
                            ((List) map.get(string3)).add(new g7.c(j112, aVar));
                            i14 = 1;
                        } else if (i15 == 5) {
                            aVar = c.a.INVALID_PAYLOD;
                            long j1122 = cursor2.getLong(2);
                            if (!map.containsKey(string3)) {
                            }
                            ((List) map.get(string3)).add(new g7.c(j1122, aVar));
                            i14 = 1;
                        } else if (i15 == 6) {
                            aVar4 = c.a.SERVER_ERROR;
                        } else {
                            h7.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                        long j11222 = cursor2.getLong(2);
                        if (!map.containsKey(string3)) {
                        }
                        ((List) map.get(string3)).add(new g7.c(j11222, aVar));
                        i14 = 1;
                    }
                    aVar = aVar4;
                    long j112222 = cursor2.getLong(2);
                    if (!map.containsKey(string3)) {
                    }
                    ((List) map.get(string3)).add(new g7.c(j112222, aVar));
                    i14 = 1;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i16 = g7.d.f16371c;
                    new ArrayList();
                    c0246a.f16359b.add(new g7.d((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                c0246a.f16358a = (f) oVar4.o(new k7.n(0, oVar4.f23053v.a()));
                c0246a.f16360c = new g7.b(new g7.e(oVar4.j().compileStatement("PRAGMA page_size").simpleQueryForLong() * oVar4.j().compileStatement("PRAGMA page_count").simpleQueryForLong(), k7.e.f23033a.f23026b));
                c0246a.f16361d = oVar4.f23056y.get();
                return new g7.a(c0246a.f16358a, Collections.unmodifiableList(c0246a.f16359b), c0246a.f16360c, c0246a.f16361d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // a7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Exception exc) {
        td.b bVar = (td.b) this.f19897x;
        ya.i iVar = (ya.i) this.f19896w;
        b0 b0Var = (b0) this.f19895v;
        bVar.getClass();
        if (exc != null) {
            iVar.c(exc);
            return;
        }
        boolean z10 = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new q7.f(bVar, 17, countDownLatch)).start();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ExecutorService executorService = o0.f26099a;
        boolean z11 = false;
        try {
            long nanos = timeUnit.toNanos(2L);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    try {
                        countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    nanos = nanoTime - System.nanoTime();
                    z11 = true;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = z11;
                    if (z10) {
                    }
                    throw th;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            iVar.d(b0Var);
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
    }

    @Override // l7.a.InterfaceC0377a
    public final Object g() {
        b bVar = (b) this.f19897x;
        s sVar = (s) this.f19896w;
        bVar.f19901d.r(sVar, (n) this.f19895v);
        bVar.f19898a.a(sVar, 1);
        return null;
    }

    @Override // oe.l
    public final Object get() {
        a1 a1Var;
        boolean z10;
        b1 b1Var;
        boolean z11;
        k kVar = (k) this.f19897x;
        q.f fVar = (q.f) this.f19896w;
        ke.r rVar = (ke.r) this.f19895v;
        int i6 = k.f21845n;
        kVar.getClass();
        androidx.work.k kVar2 = kVar.f21846a;
        long d10 = kVar2.r().d();
        Iterator it = ((Map) fVar.f29105w).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a1Var = kVar.f21853i;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            a0 a0Var = (a0) entry.getValue();
            SparseArray<b1> sparseArray = kVar.f21854j;
            b1 b1Var2 = sparseArray.get(intValue);
            if (b1Var2 != null) {
                a1Var.i(a0Var.f26156e, intValue);
                ImmutableSortedSet<ke.i> immutableSortedSet = a0Var.f26154c;
                a1Var.f(immutableSortedSet, intValue);
                Iterator it2 = it;
                ke.r rVar2 = rVar;
                k kVar3 = kVar;
                androidx.work.k kVar4 = kVar2;
                b1 b1Var3 = new b1(b1Var2.f21796a, b1Var2.f21797b, d10, b1Var2.f21799d, b1Var2.f21800e, b1Var2.f, b1Var2.f21801g);
                if (((Set) fVar.f29106x).contains(Integer.valueOf(intValue))) {
                    h.C0164h c0164h = com.google.protobuf.h.f9922v;
                    ke.r rVar3 = ke.r.f23293v;
                    b1 a10 = b1Var3.a(c0164h, rVar3);
                    b1Var = new b1(a10.f21796a, a10.f21797b, a10.f21798c, a10.f21799d, a10.f21800e, rVar3, a10.f21801g);
                } else {
                    com.google.protobuf.h hVar = a0Var.f26152a;
                    if (!hVar.isEmpty()) {
                        b1Var = b1Var3.a(hVar, (ke.r) fVar.f29104v);
                    } else {
                        b1Var = b1Var3;
                    }
                }
                sparseArray.put(intValue, b1Var);
                if (b1Var2.f21801g.isEmpty() || b1Var.f21800e.f23294u.f31450u - b1Var2.f21800e.f23294u.f31450u >= k.f21844m || a0Var.f26156e.size() + a0Var.f26155d.size() + immutableSortedSet.size() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    a1Var.g(b1Var);
                }
                it = it2;
                rVar = rVar2;
                kVar = kVar3;
                kVar2 = kVar4;
            }
        }
        k kVar5 = kVar;
        ke.r rVar4 = rVar;
        androidx.work.k kVar6 = kVar2;
        Map map = (Map) fVar.f29107y;
        Set set = (Set) fVar.f29108z;
        for (ke.i iVar : map.keySet()) {
            if (set.contains(iVar)) {
                kVar6.r().e(iVar);
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set keySet = map.keySet();
        c0 c0Var = kVar5.f21850e;
        HashMap e10 = c0Var.e(keySet);
        for (Map.Entry entry2 : map.entrySet()) {
            ke.i iVar2 = (ke.i) entry2.getKey();
            ke.n nVar = (ke.n) entry2.getValue();
            ke.n nVar2 = (ke.n) e10.get(iVar2);
            if (nVar.b() != nVar2.b()) {
                hashSet.add(iVar2);
            }
            if (nVar.h() && nVar.f23287d.equals(ke.r.f23293v)) {
                arrayList.add(nVar.f23285b);
                hashMap.put(iVar2, nVar);
            } else if ((!v.h.b(nVar2.f23286c, 1)) && nVar.f23287d.compareTo(nVar2.f23287d) <= 0 && (nVar.f23287d.compareTo(nVar2.f23287d) != 0 || !nVar2.f())) {
                kc.f.A(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", iVar2, nVar2.f23287d, nVar.f23287d);
            } else {
                ca.a.u0(!ke.r.f23293v.equals(nVar.f23288e), "Cannot add a document when the remote version is zero", new Object[0]);
                c0Var.a(nVar, nVar.f23288e);
                hashMap.put(iVar2, nVar);
            }
        }
        c0Var.f(arrayList);
        ke.r e11 = a1Var.e();
        if (!rVar4.equals(ke.r.f23293v)) {
            if (rVar4.compareTo(e11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Watch stream reverted to previous snapshot?? (%s < %s)", rVar4, e11);
            a1Var.h(rVar4);
        }
        return kVar5.f.e(hashMap, hashSet);
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        ((p7.o) obj).n0();
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        boolean z10;
        nf.b bVar = (nf.b) this.f19897x;
        ya.h hVar2 = (ya.h) this.f19896w;
        ya.h hVar3 = (ya.h) this.f19895v;
        bVar.getClass();
        if (hVar2.isSuccessful() && hVar2.getResult() != null) {
            of.c cVar = (of.c) hVar2.getResult();
            if (hVar3.isSuccessful()) {
                of.c cVar2 = (of.c) hVar3.getResult();
                if (cVar2 != null && cVar.f27445c.equals(cVar2.f27445c)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return ya.k.e(Boolean.FALSE);
                }
            }
            return bVar.f26292d.d(cVar).continueWith(bVar.f26290b, new nf.a(bVar));
        }
        return ya.k.e(Boolean.FALSE);
    }

    public /* synthetic */ a(o oVar, Object obj, s sVar, int i6) {
        this.f19894u = i6;
        this.f19897x = oVar;
        this.f19895v = obj;
        this.f19896w = sVar;
    }
}
