package lo;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import b9.m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import o7.e;
import o7.g;
import q7.d;
import u7.f;
import z8.h;
/* compiled from: ProAssessmentVideoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {
    public static final /* synthetic */ int B = 0;

    /* renamed from: v  reason: collision with root package name */
    public float f24476v;

    /* renamed from: w  reason: collision with root package name */
    public a0 f24477w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f24478x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f24479y;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f24475u = LogHelper.INSTANCE.makeLogTag(c.class);

    /* renamed from: z  reason: collision with root package name */
    public boolean f24480z = true;

    @Override // rr.b
    public final boolean I() {
        try {
            if (this.f24479y) {
                J();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("source", "regular_quit");
                gk.a.b(bundle, "pro_assessment_video_quit");
                ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                p activity = getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
            }
            return false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24475u, e10);
            return false;
        }
    }

    public final void J() {
        try {
            a0 a0Var = this.f24477w;
            if (a0Var != null) {
                a0Var.z(false);
            }
            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_pro_assessment_video_fragment, requireContext(), R.style.Theme_Dialog);
            RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.proVideoCtaYes);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new View.OnClickListener() { // from class: lo.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = r3;
                        c this$0 = this;
                        Dialog dialog = styledDialog;
                        switch (i6) {
                            case 0:
                                int i10 = c.B;
                                i.g(dialog, "$dialog");
                                i.g(this$0, "this$0");
                                dialog.dismiss();
                                ApplicationPersistence.getInstance().deleteKey("pro_show_video");
                                Bundle bundle = new Bundle();
                                bundle.putString("source", "dashboard_quit");
                                gk.a.b(bundle, "pro_assessment_video_quit");
                                p activity = this$0.getActivity();
                                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                ((rr.a) activity).t0();
                                return;
                            default:
                                int i11 = c.B;
                                i.g(dialog, "$dialog");
                                i.g(this$0, "this$0");
                                dialog.dismiss();
                                a0 a0Var2 = this$0.f24477w;
                                if (a0Var2 != null) {
                                    a0Var2.z(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.proVideoCtaNo);
            if (robertoTextView2 != null) {
                robertoTextView2.setOnClickListener(new View.OnClickListener() { // from class: lo.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = r3;
                        c this$0 = this;
                        Dialog dialog = styledDialog;
                        switch (i6) {
                            case 0:
                                int i10 = c.B;
                                i.g(dialog, "$dialog");
                                i.g(this$0, "this$0");
                                dialog.dismiss();
                                ApplicationPersistence.getInstance().deleteKey("pro_show_video");
                                Bundle bundle = new Bundle();
                                bundle.putString("source", "dashboard_quit");
                                gk.a.b(bundle, "pro_assessment_video_quit");
                                p activity = this$0.getActivity();
                                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                ((rr.a) activity).t0();
                                return;
                            default:
                                int i11 = c.B;
                                i.g(dialog, "$dialog");
                                i.g(this$0, "this$0");
                                dialog.dismiss();
                                a0 a0Var2 = this$0.f24477w;
                                if (a0Var2 != null) {
                                    a0Var2.z(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            styledDialog.show();
            gk.a.b(null, "pro_assessment_video_quit_dialog");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24475u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_pro_assessment_video, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:2:0x0000, B:4:0x0005, B:8:0x000e, B:11:0x0015), top: B:17:0x0000 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        a0 a0Var;
        boolean z10;
        a0 a0Var2;
        try {
            a0Var = this.f24477w;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24475u, e10);
        }
        if (a0Var != null) {
            z10 = true;
            if (a0Var.isPlaying()) {
                this.f24478x = z10;
                a0Var2 = this.f24477w;
                if (a0Var2 == null) {
                    a0Var2.z(false);
                }
                super.onPause();
            }
        }
        z10 = false;
        this.f24478x = z10;
        a0Var2 = this.f24477w;
        if (a0Var2 == null) {
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            if (this.f24478x) {
                a0 a0Var = this.f24477w;
                if (a0Var != null) {
                    a0Var.z(true);
                }
                this.f24478x = false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24475u, e10);
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4 A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0008, B:5:0x001a, B:9:0x0028, B:15:0x0034, B:16:0x0042, B:18:0x0074, B:20:0x00c4, B:21:0x00cc, B:25:0x00dd, B:29:0x00eb, B:31:0x00ef, B:32:0x00f9, B:34:0x0104, B:28:0x00e6, B:24:0x00da), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        AppCompatImageView appCompatImageView;
        PlayerView playerView;
        PlayerView playerView2;
        a0 a0Var;
        ConstraintLayout constraintLayout;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f24479y = ApplicationPersistence.getInstance().containsKey("pro_show_video");
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("pro_video_url", "");
            } else {
                str = null;
            }
            if (str != null && !n.B0(str)) {
                z10 = false;
                if (z10) {
                    p activity = getActivity();
                    i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity).t0();
                }
                Uri parse = Uri.parse(str);
                m mVar = new m(requireContext());
                f0.b bVar = new f0.b(19, new f());
                com.google.android.exoplayer2.drm.a aVar = new com.google.android.exoplayer2.drm.a();
                com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a();
                q.a aVar3 = new q.a();
                aVar3.f6690b = parse;
                q a10 = aVar3.a();
                a10.f6685v.getClass();
                com.google.android.exoplayer2.source.n nVar = new com.google.android.exoplayer2.source.n(a10, mVar, bVar, aVar.a(a10), aVar2, 1048576);
                d dVar = new d(3, 0, 1, 1);
                Context requireContext = requireContext();
                a0 a11 = new j.b(requireContext, new g(0, new o7.d(requireContext())), new e(requireContext, 4)).a();
                a11.n0(nVar);
                a11.q0(dVar, true);
                this.f24476v = a11.f6188z;
                a11.t0(0.0f);
                a11.z(true);
                appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.exitCta);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: lo.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f24471v;

                        {
                            this.f24471v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            c this$0 = this.f24471v;
                            switch (i6) {
                                case 0:
                                    int i10 = c.B;
                                    i.g(this$0, "this$0");
                                    if (this$0.f24479y) {
                                        this$0.J();
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("source", "regular_quit");
                                    gk.a.b(bundle2, "pro_assessment_video_quit");
                                    ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                                    p activity2 = this$0.getActivity();
                                    i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity2).t0();
                                    return;
                                default:
                                    int i11 = c.B;
                                    i.g(this$0, "this$0");
                                    if (this$0.f24480z) {
                                        a0 a0Var2 = this$0.f24477w;
                                        if (a0Var2 != null) {
                                            a0Var2.t0(this$0.f24476v);
                                        }
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.unmuteImage);
                                        if (appCompatImageView2 != null) {
                                            appCompatImageView2.setImageResource(R.drawable.ic_audio);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.unmuteText);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.proVideoMute));
                                        }
                                    } else {
                                        a0 a0Var3 = this$0.f24477w;
                                        if (a0Var3 != null) {
                                            a0Var3.t0(0.0f);
                                        }
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.unmuteImage);
                                        if (appCompatImageView3 != null) {
                                            appCompatImageView3.setImageResource(R.drawable.ic_mute);
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.unmuteText);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.proVideoUnmute));
                                        }
                                    }
                                    this$0.f24480z = !this$0.f24480z;
                                    return;
                            }
                        }
                    });
                }
                this.f24477w = a11;
                playerView = (PlayerView) _$_findCachedViewById(R.id.paVideoPlayer);
                if (playerView == null) {
                    playerView.setResizeMode(4);
                }
                playerView2 = (PlayerView) _$_findCachedViewById(R.id.paVideoPlayer);
                if (playerView2 == null) {
                    playerView2.setPlayer(this.f24477w);
                }
                a0Var = this.f24477w;
                if (a0Var != null) {
                    a0Var.f6168d.i0(new a());
                }
                constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.unmuteLayout);
                if (constraintLayout == null) {
                    constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: lo.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f24471v;

                        {
                            this.f24471v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            c this$0 = this.f24471v;
                            switch (i6) {
                                case 0:
                                    int i10 = c.B;
                                    i.g(this$0, "this$0");
                                    if (this$0.f24479y) {
                                        this$0.J();
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("source", "regular_quit");
                                    gk.a.b(bundle2, "pro_assessment_video_quit");
                                    ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                                    p activity2 = this$0.getActivity();
                                    i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity2).t0();
                                    return;
                                default:
                                    int i11 = c.B;
                                    i.g(this$0, "this$0");
                                    if (this$0.f24480z) {
                                        a0 a0Var2 = this$0.f24477w;
                                        if (a0Var2 != null) {
                                            a0Var2.t0(this$0.f24476v);
                                        }
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.unmuteImage);
                                        if (appCompatImageView2 != null) {
                                            appCompatImageView2.setImageResource(R.drawable.ic_audio);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.unmuteText);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.proVideoMute));
                                        }
                                    } else {
                                        a0 a0Var3 = this$0.f24477w;
                                        if (a0Var3 != null) {
                                            a0Var3.t0(0.0f);
                                        }
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.unmuteImage);
                                        if (appCompatImageView3 != null) {
                                            appCompatImageView3.setImageResource(R.drawable.ic_mute);
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.unmuteText);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.proVideoUnmute));
                                        }
                                    }
                                    this$0.f24480z = !this$0.f24480z;
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            z10 = true;
            if (z10) {
            }
            Uri parse2 = Uri.parse(str);
            m mVar2 = new m(requireContext());
            f0.b bVar2 = new f0.b(19, new f());
            com.google.android.exoplayer2.drm.a aVar4 = new com.google.android.exoplayer2.drm.a();
            com.google.android.exoplayer2.upstream.a aVar22 = new com.google.android.exoplayer2.upstream.a();
            q.a aVar32 = new q.a();
            aVar32.f6690b = parse2;
            q a102 = aVar32.a();
            a102.f6685v.getClass();
            com.google.android.exoplayer2.source.n nVar2 = new com.google.android.exoplayer2.source.n(a102, mVar2, bVar2, aVar4.a(a102), aVar22, 1048576);
            d dVar2 = new d(3, 0, 1, 1);
            Context requireContext2 = requireContext();
            a0 a112 = new j.b(requireContext2, new g(0, new o7.d(requireContext())), new e(requireContext2, 4)).a();
            a112.n0(nVar2);
            a112.q0(dVar2, true);
            this.f24476v = a112.f6188z;
            a112.t0(0.0f);
            a112.z(true);
            appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.exitCta);
            if (appCompatImageView != null) {
            }
            this.f24477w = a112;
            playerView = (PlayerView) _$_findCachedViewById(R.id.paVideoPlayer);
            if (playerView == null) {
            }
            playerView2 = (PlayerView) _$_findCachedViewById(R.id.paVideoPlayer);
            if (playerView2 == null) {
            }
            a0Var = this.f24477w;
            if (a0Var != null) {
            }
            constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.unmuteLayout);
            if (constraintLayout == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24475u, e10);
        }
    }

    /* compiled from: ProAssessmentVideoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w.b {
        public a() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void V(int i6, boolean z10) {
            int i10;
            c cVar = c.this;
            ProgressBar progressBar = (ProgressBar) cVar._$_findCachedViewById(R.id.progressBar);
            if (progressBar != null) {
                if (i6 == 2) {
                    i10 = 0;
                } else {
                    PlayerView playerView = (PlayerView) cVar._$_findCachedViewById(R.id.paVideoPlayer);
                    if (playerView != null) {
                        playerView.f(playerView.e());
                    }
                    i10 = 8;
                }
                progressBar.setVisibility(i10);
            }
            if (i6 == 4) {
                ApplicationPersistence.getInstance().deleteKey("pro_show_video");
                Bundle bundle = new Bundle();
                bundle.putString("source", "video_complete");
                gk.a.b(bundle, "pro_assessment_video_quit");
                p activity = cVar.getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
            }
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void C(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void L(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(f0 f0Var) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void s(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void x(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void D(w wVar, w.c cVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(o8.p pVar, h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void v(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
        }
    }
}
