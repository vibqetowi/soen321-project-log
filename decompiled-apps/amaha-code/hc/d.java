package hc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b1;
import androidx.work.impl.WorkDatabase;
import c9.w;
import com.facebook.FacebookException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.p000firebaseauthapi.q2;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.google.android.gms.internal.p000firebaseauthapi.r2;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.AssessmentQuestionOld;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import dt.n;
import g.x;
import gt.v0;
import gv.n;
import is.u;
import is.z;
import java.io.EOFException;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import k3.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.r;
import mc.o;
import org.json.JSONArray;
import org.json.JSONObject;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.f1;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.n0;
import wu.n1;
import wu.v;
import wu.x0;
import yt.o;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class d implements ya.b, a0, o, m4.a, pe.e, ya.g {
    public static boolean A;
    public static boolean B;
    public static Method C;
    public static Context V;
    public static final r X;
    public static final r Y;
    public static final kotlinx.coroutines.sync.a Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final kotlinx.coroutines.sync.a f17367a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ d f17368b0;

    /* renamed from: u  reason: collision with root package name */
    public static qd f17369u;

    /* renamed from: v  reason: collision with root package name */
    public static int f17370v;

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f17371w = {R.attr.resize_mode};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f17372x = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f17373y = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f17374z = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.auto_show, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};
    public static final int[] D = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static final int[] E = {R.attr.civ_border_color, R.attr.civ_border_overlay, R.attr.civ_border_width, R.attr.civ_fill_color};
    public static final int[] F = {R.attr.cpb_background_progressbar_color, R.attr.cpb_background_progressbar_width, R.attr.cpb_default_gradient, R.attr.cpb_indeterminate_mode, R.attr.cpb_max_arc_angle, R.attr.cpb_progress, R.attr.cpb_progress_max, R.attr.cpb_progressbar_color, R.attr.cpb_progressbar_width, R.attr.cpb_round_border, R.attr.cpb_start_angle};
    public static final int[] G = {R.attr.angle, R.attr.background_color, R.attr.border_color, R.attr.border_gradient_colors, R.attr.border_thickness, R.attr.start_angle, R.attr.thumb_color, R.attr.thumb_image, R.attr.thumb_size};
    public static final int[] H = {R.attr.font_name};
    public static final int[] I = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.touch_target_height, R.attr.unplayed_color};
    public static final int[] J = {R.attr.LoadingDots_auto_play, R.attr.LoadingDots_dots_color, R.attr.LoadingDots_dots_count, R.attr.LoadingDots_dots_size, R.attr.LoadingDots_dots_space, R.attr.LoadingDots_jump_duration, R.attr.LoadingDots_jump_height, R.attr.LoadingDots_loop_duration, R.attr.LoadingDots_loop_start_delay};
    public static final int[] K = {R.attr.bgColor, R.attr.bgShadowColor, R.attr.ringSweepAngle, R.attr.ringWidthScale, R.attr.rotate, R.attr.showBackground, R.attr.showBackgroundShadow, R.attr.showRingCorner};
    public static final int[] L = {R.attr.acv_lines_count, R.attr.acv_lines_space, R.attr.acv_lines_width, R.attr.acv_mid_start_extra_offset, R.attr.acv_sections_count, R.attr.acv_sections_space, R.attr.acv_start_degree_offset};
    public static final d M = new d();
    public static final d N = new d();
    public static final d O = new d();
    public static final d P = new d();
    public static final d Q = new d();
    public static final d R = new d();
    public static final q2 S = new q2();
    public static final r2 T = new r2();
    public static final d U = new d();
    public static final r W = new r("UNLOCK_FAIL");

    static {
        r rVar = new r("LOCKED");
        X = rVar;
        r rVar2 = new r("UNLOCKED");
        Y = rVar2;
        Z = new kotlinx.coroutines.sync.a(rVar);
        f17367a0 = new kotlinx.coroutines.sync.a(rVar2);
        f17368b0 = new d();
    }

    public static ArrayList A(Context context, String str) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.g(context, "context");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        arrayList2 = Q(context);
                        String string = context.getString(R.string.happinessAssessment);
                        kotlin.jvm.internal.i.f(string, "context.getString(R.string.happinessAssessment)");
                        arrayList2.set(0, new AssessmentQuestionOld("AL", null, 3, string, context.getString(R.string.healthAssessmentPromptHappiness), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
                        arrayList = new ArrayList();
                        String string2 = context.getString(R.string.completionHealth);
                        kotlin.jvm.internal.i.f(string2, "context.getString(R.string.completionHealth)");
                        arrayList.add(new AssessmentQuestionOld("AL", null, 9, string2, context.getString(R.string.nextAssessmentPromptTwo), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
                        String string3 = context.getString(R.string.factorAssessment);
                        kotlin.jvm.internal.i.f(string3, "context.getString(R.string.factorAssessment)");
                        ArrayList h10 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string3, context.getString(R.string.happinessSymptomSeparator), new ArrayList(), null, false, 1, null, null));
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, h10, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        h10.add(context.getString(R.string.iaResponseAgree));
                        h10.add(context.getString(R.string.iaResponseStronglyagree));
                        ArrayList arrayList6 = new ArrayList();
                        defpackage.e.r(context, R.string.iaResponseNotatall, arrayList6, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
                        arrayList6.add(context.getString(R.string.iaResponseMostofthetime));
                        arrayList6.add(context.getString(R.string.iaResponseAlways));
                        String string4 = context.getString(R.string.happinessSymptomQ1);
                        kotlin.jvm.internal.i.f(string4, "context.getString(R.string.happinessSymptomQ1)");
                        ArrayList h11 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string4, null, arrayList6, "S", false, 1, null, "Positive Thoughts"));
                        defpackage.e.r(context, R.string.iaResponseExUntrue, h11, R.string.iaResponseUntrue, R.string.iaResponseUnsure);
                        h11.add(context.getString(R.string.iaResponseTrue));
                        h11.add(context.getString(R.string.iaResponseExTrue));
                        String string5 = context.getString(R.string.happinessSymptomQ2);
                        kotlin.jvm.internal.i.f(string5, "context.getString(R.string.happinessSymptomQ2)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string5, null, h10, "S", false, 1, null, "Gratitude"));
                        String string6 = context.getString(R.string.happinessSymptomQ3);
                        kotlin.jvm.internal.i.f(string6, "context.getString(R.string.happinessSymptomQ3)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string6, null, h11, "S", false, 1, null, "Mindfulness"));
                        String string7 = context.getString(R.string.happinessSymptomQ4);
                        kotlin.jvm.internal.i.f(string7, "context.getString(R.string.happinessSymptomQ4)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string7, null, h10, "S", false, 1, null, "Social Support"));
                        String string8 = context.getString(R.string.happinessSymptomQ5);
                        kotlin.jvm.internal.i.f(string8, "context.getString(R.string.happinessSymptomQ5)");
                        ArrayList h12 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string8, null, arrayList6, "S", false, 1, null, "Self-Competence"));
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, h12, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        h12.add(context.getString(R.string.iaResponseAgree));
                        h12.add(context.getString(R.string.iaResponseStronglyagree));
                        ArrayList arrayList7 = new ArrayList();
                        defpackage.e.r(context, R.string.iaResponseNever, arrayList7, R.string.iaResponseRarely, R.string.iaResponseSometimes);
                        arrayList7.add(context.getString(R.string.iaResponseOften));
                        arrayList7.add(context.getString(R.string.iaResponseAlways));
                        String string9 = context.getString(R.string.happinessSymptomQ6);
                        kotlin.jvm.internal.i.f(string9, "context.getString(R.string.happinessSymptomQ6)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string9, null, h12, "S", false, 1, null, "Balanced Thinking"));
                        String string10 = context.getString(R.string.happinessSymptomQ7);
                        kotlin.jvm.internal.i.f(string10, "context.getString(R.string.happinessSymptomQ7)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string10, null, arrayList7, "S", false, 1, null, "Positive Emotions"));
                        String string11 = context.getString(R.string.happinessSymptomQ8);
                        kotlin.jvm.internal.i.f(string11, "context.getString(R.string.happinessSymptomQ8)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string11, null, h11, "S", false, 1, null, "Resilience"));
                        String string12 = context.getString(R.string.happinessSymptomQ9);
                        kotlin.jvm.internal.i.f(string12, "context.getString(R.string.happinessSymptomQ9)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string12, null, h12, "S", false, 1, null, "Meaning Making"));
                        arrayList4 = P(context);
                        ((AssessmentQuestionOld) arrayList4.get(0)).setTitle(context.getString(R.string.excellentWork, FirebasePersistence.getInstance().getUser().getFirstName()));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setSubtitle(context.getString(R.string.nextAssessmentPromptHappiness));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setBtnText(context.getString(R.string.continue_text));
                        ((AssessmentQuestionOld) arrayList4.get(1)).setSubtitle(context.getString(R.string.happinessGlobalSeparator));
                        ((AssessmentQuestionOld) arrayList4.get(2)).setTitle(context.getString(R.string.happinessGlobalQ1));
                        ArrayList<String> arrayList8 = new ArrayList<>();
                        defpackage.e.r(context, R.string.iaResponseNotatall, arrayList8, R.string.iaResponseMaybeLittle, R.string.iaResponseSomewhat);
                        arrayList8.add(context.getString(R.string.iaResponseQuiteBit));
                        arrayList8.add(context.getString(R.string.iaResponseSignificantly));
                        ((AssessmentQuestionOld) arrayList4.get(2)).setResponseOptions(arrayList8);
                        ((AssessmentQuestionOld) arrayList4.get(3)).setTitle(context.getString(R.string.allDoneName, FirebasePersistence.getInstance().getUser().getFirstName()));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setSubtitle(context.getString(R.string.completionAllHappiness));
                        arrayList3 = arrayList;
                        break;
                    }
                    break;
                case -1617042330:
                    if (str.equals(Constants.COURSE_DEPRESSION)) {
                        arrayList2 = Q(context);
                        String string13 = context.getString(R.string.depressionAssessment);
                        kotlin.jvm.internal.i.f(string13, "context.getString(R.string.depressionAssessment)");
                        arrayList2.set(0, new AssessmentQuestionOld("AL", null, 3, string13, context.getString(R.string.healthAssessmentPromptDepression), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
                        arrayList = new ArrayList();
                        String string14 = context.getString(R.string.completionHealth);
                        kotlin.jvm.internal.i.f(string14, "context.getString(R.string.completionHealth)");
                        arrayList.add(new AssessmentQuestionOld("AL", null, 6, string14, context.getString(R.string.nextAssessmentPromptOne), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
                        String string15 = context.getString(R.string.symptomAssessment);
                        kotlin.jvm.internal.i.f(string15, "context.getString(R.string.symptomAssessment)");
                        ArrayList h13 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string15, context.getString(R.string.depressionSymptomSeparator), new ArrayList(), null, false, 1, null, null));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h13, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
                        h13.add(context.getString(R.string.iaResponseMostofthetime));
                        h13.add(context.getString(R.string.iaResponseAlways));
                        String string16 = context.getString(R.string.depressionSymptomQ1);
                        kotlin.jvm.internal.i.f(string16, "context.getString(R.string.depressionSymptomQ1)");
                        ArrayList h14 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string16, null, h13, "S", false, 1, null, "Low Mood"));
                        defpackage.e.r(context, R.string.iaResponseExUntrue, h14, R.string.iaResponseUntrue, R.string.iaResponseUnsure);
                        h14.add(context.getString(R.string.iaResponseTrue));
                        h14.add(context.getString(R.string.iaResponseExTrue));
                        ArrayList arrayList9 = new ArrayList();
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, arrayList9, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        arrayList9.add(context.getString(R.string.iaResponseAgree));
                        arrayList9.add(context.getString(R.string.iaResponseStronglyagree));
                        String string17 = context.getString(R.string.depressionSymptomQ2);
                        kotlin.jvm.internal.i.f(string17, "context.getString(R.string.depressionSymptomQ2)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string17, null, arrayList9, "S", false, 1, null, "Low Interest"));
                        String string18 = context.getString(R.string.depressionSymptomQ3);
                        kotlin.jvm.internal.i.f(string18, "context.getString(R.string.depressionSymptomQ3)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string18, null, h14, "S", false, 1, null, "Fatigue"));
                        String string19 = context.getString(R.string.depressionSymptomQ4);
                        kotlin.jvm.internal.i.f(string19, "context.getString(R.string.depressionSymptomQ4)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string19, null, h13, "S", false, 1, null, "Lack of Focus"));
                        String string20 = context.getString(R.string.depressionSymptomQ5);
                        kotlin.jvm.internal.i.f(string20, "context.getString(R.string.depressionSymptomQ5)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string20, null, arrayList9, "S", false, 1, null, "Low Self-esteem"));
                        String string21 = context.getString(R.string.depressionSymptomQ6);
                        kotlin.jvm.internal.i.f(string21, "context.getString(R.string.depressionSymptomQ6)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string21, null, h14, "S", false, 1, null, "Negative Thoughts"));
                        arrayList4 = P(context);
                        ((AssessmentQuestionOld) arrayList4.get(0)).setTitle(context.getString(R.string.excellentWork, FirebasePersistence.getInstance().getUser().getFirstName()));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setSubtitle(context.getString(R.string.nextAssessmentPromptDepression));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setBtnText(context.getString(R.string.continue_text));
                        ((AssessmentQuestionOld) arrayList4.get(1)).setSubtitle(context.getString(R.string.depressionGlobalSeparator));
                        ((AssessmentQuestionOld) arrayList4.get(2)).setTitle(context.getString(R.string.depressionGlobalQ1));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setTitle(context.getString(R.string.allDoneName, FirebasePersistence.getInstance().getUser().getFirstName()));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setSubtitle(context.getString(R.string.completionAllDepression));
                        arrayList3 = arrayList;
                        break;
                    }
                    break;
                case -891989580:
                    if (str.equals(Constants.COURSE_STRESS)) {
                        arrayList2 = Q(context);
                        arrayList3 = new ArrayList();
                        String string22 = context.getString(R.string.completionHealth);
                        kotlin.jvm.internal.i.f(string22, "context.getString(R.string.completionHealth)");
                        arrayList3.add(new AssessmentQuestionOld("AL", null, 7, string22, context.getString(R.string.nextAssessmentPromptOne), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
                        String string23 = context.getString(R.string.symptomAssessment);
                        kotlin.jvm.internal.i.f(string23, "context.getString(R.string.symptomAssessment)");
                        ArrayList h15 = defpackage.d.h(arrayList3, new AssessmentQuestionOld("S", null, null, string23, context.getString(R.string.stressSymptomSeparator), new ArrayList(), null, false, 1, null, null));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h15, R.string.iaResponseNotveryoften, R.string.iaResponseMaybesometimescomma);
                        h15.add(context.getString(R.string.iaResponseMostofthetime));
                        h15.add(context.getString(R.string.iaResponseAllthetime));
                        String string24 = context.getString(R.string.stressSymptomQ1);
                        kotlin.jvm.internal.i.f(string24, "context.getString(R.string.stressSymptomQ1)");
                        ArrayList h16 = defpackage.d.h(arrayList3, new AssessmentQuestionOld("Q", 1, null, string24, null, h15, "S", false, 1, null, "Trouble Relaxing"));
                        defpackage.e.r(context, R.string.iaResponseNever, h16, R.string.iaResponseRarely, R.string.iaResponseSometimes);
                        h16.add(context.getString(R.string.iaResponseOften));
                        h16.add(context.getString(R.string.iaResponseAlways));
                        String string25 = context.getString(R.string.stressSymptomQ2);
                        kotlin.jvm.internal.i.f(string25, "context.getString(R.string.stressSymptomQ2)");
                        ArrayList h17 = defpackage.d.h(arrayList3, new AssessmentQuestionOld("Q", 1, null, string25, null, h16, "S", false, 1, null, "Lack of Focus"));
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, h17, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        h17.add(context.getString(R.string.iaResponseAgree));
                        h17.add(context.getString(R.string.iaResponseStronglyagree));
                        String string26 = context.getString(R.string.stressSymptomQ3);
                        kotlin.jvm.internal.i.f(string26, "context.getString(R.string.stressSymptomQ3)");
                        ArrayList h18 = defpackage.d.h(arrayList3, new AssessmentQuestionOld("Q", 1, null, string26, null, h17, "S", false, 1, null, "Low Tolerance"));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h18, R.string.iaResponseNotveryoften, R.string.iaResponseMaybesometimescomma);
                        h18.add(context.getString(R.string.iaResponseMostofthetime));
                        h18.add(context.getString(R.string.iaResponseAllthetime));
                        String string27 = context.getString(R.string.stressSymptomQ4);
                        kotlin.jvm.internal.i.f(string27, "context.getString(R.string.stressSymptomQ4)");
                        arrayList3.add(new AssessmentQuestionOld("Q", 1, null, string27, null, h18, "S", false, 1, null, "Poor Problem Solving"));
                        String string28 = context.getString(R.string.stressSymptomQ5);
                        kotlin.jvm.internal.i.f(string28, "context.getString(R.string.stressSymptomQ5)");
                        ArrayList h19 = defpackage.d.h(arrayList3, new AssessmentQuestionOld("Q", 1, null, string28, null, h17, "S", false, 1, null, "Poor Time Management"));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h19, R.string.iaResponseRarely, R.string.iaResponseOccasionally);
                        h19.add(context.getString(R.string.iaResponseFrequently));
                        h19.add(context.getString(R.string.iaResponseAllthetime));
                        String string29 = context.getString(R.string.stressSymptomQ6);
                        kotlin.jvm.internal.i.f(string29, "context.getString(R.string.stressSymptomQ6)");
                        arrayList3.add(new AssessmentQuestionOld("Q", 1, null, string29, null, h19, "S", false, 1, null, "Communication Problems"));
                        String string30 = context.getString(R.string.stressSymptomQ7);
                        kotlin.jvm.internal.i.f(string30, "context.getString(R.string.stressSymptomQ7)");
                        arrayList3.add(new AssessmentQuestionOld("Q", 1, null, string30, null, h18, "S", false, 1, null, "Negative Thoughts"));
                        arrayList4 = P(context);
                        break;
                    }
                    break;
                case 92960775:
                    if (str.equals(Constants.COURSE_ANGER)) {
                        arrayList2 = Q(context);
                        String string31 = context.getString(R.string.angerAssessment);
                        kotlin.jvm.internal.i.f(string31, "context.getString(R.string.angerAssessment)");
                        arrayList2.set(0, new AssessmentQuestionOld("AL", null, 3, string31, context.getString(R.string.healthAssessmentPromptAnger), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
                        ArrayList<String> arrayList10 = new ArrayList<>();
                        defpackage.e.r(context, R.string.iaResponseRarely, arrayList10, R.string.iaResponseSometimes, R.string.iaResponseOften);
                        arrayList10.add(context.getString(R.string.iaResponseAllthetime));
                        ((AssessmentQuestionOld) arrayList2.get(3)).setResponseOptions(arrayList10);
                        arrayList = new ArrayList();
                        String string32 = context.getString(R.string.completionHealth);
                        kotlin.jvm.internal.i.f(string32, "context.getString(R.string.completionHealth)");
                        arrayList.add(new AssessmentQuestionOld("AL", null, 6, string32, context.getString(R.string.nextAssessmentPromptOne), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
                        String string33 = context.getString(R.string.symptomAssessment);
                        kotlin.jvm.internal.i.f(string33, "context.getString(R.string.symptomAssessment)");
                        ArrayList h20 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string33, context.getString(R.string.angerSymptomSeparator), new ArrayList(), null, false, 1, null, null));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h20, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
                        h20.add(context.getString(R.string.iaResponseMostofthetime));
                        h20.add(context.getString(R.string.iaResponseAlways));
                        String string34 = context.getString(R.string.angerSymptomQ1);
                        kotlin.jvm.internal.i.f(string34, "context.getString(R.string.angerSymptomQ1)");
                        ArrayList h21 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string34, null, h20, "S", false, 1, null, "Poor Understanding"));
                        defpackage.e.r(context, R.string.iaResponseExUntrue, h21, R.string.iaResponseUntrue, R.string.iaResponseUnsure);
                        h21.add(context.getString(R.string.iaResponseTrue));
                        h21.add(context.getString(R.string.iaResponseExTrue));
                        String string35 = context.getString(R.string.angerSymptomQ2);
                        kotlin.jvm.internal.i.f(string35, "context.getString(R.string.angerSymptomQ2)");
                        ArrayList h22 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string35, null, h21, "S", false, 1, null, "Poor Self-Calming"));
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, h22, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        h22.add(context.getString(R.string.iaResponseAgree));
                        h22.add(context.getString(R.string.iaResponseStronglyagree));
                        String string36 = context.getString(R.string.angerSymptomQ3);
                        kotlin.jvm.internal.i.f(string36, "context.getString(R.string.angerSymptomQ3)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string36, null, h20, "S", false, 1, null, "Mindlessness"));
                        String string37 = context.getString(R.string.angerSymptomQ4);
                        kotlin.jvm.internal.i.f(string37, "context.getString(R.string.angerSymptomQ4)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string37, null, h21, "S", false, 1, null, "Rumination"));
                        String string38 = context.getString(R.string.angerSymptomQ5);
                        kotlin.jvm.internal.i.f(string38, "context.getString(R.string.angerSymptomQ5)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string38, null, h20, "S", false, 1, null, "Communication Problems"));
                        String string39 = context.getString(R.string.angerSymptomQ6);
                        kotlin.jvm.internal.i.f(string39, "context.getString(R.string.angerSymptomQ6)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string39, null, h22, "S", false, 1, null, "Negative Thoughts"));
                        arrayList4 = P(context);
                        ((AssessmentQuestionOld) arrayList4.get(0)).setSubtitle(context.getString(R.string.nextAssessmentPromptAnger));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setBtnText(context.getString(R.string.continue_text));
                        ((AssessmentQuestionOld) arrayList4.get(1)).setSubtitle(context.getString(R.string.angerGlobalSeparator));
                        ((AssessmentQuestionOld) arrayList4.get(2)).setTitle(context.getString(R.string.angerGlobalQ1));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setTitle(context.getString(R.string.allDone));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setSubtitle(context.getString(R.string.completionAllAnger));
                        arrayList3 = arrayList;
                        break;
                    }
                    break;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        arrayList2 = Q(context);
                        String string40 = context.getString(R.string.sleepAssessment);
                        kotlin.jvm.internal.i.f(string40, "context.getString(R.string.sleepAssessment)");
                        arrayList2.set(0, new AssessmentQuestionOld("AL", null, 3, string40, context.getString(R.string.healthAssessmentPromptSleep), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
                        ArrayList<String> arrayList11 = new ArrayList<>();
                        defpackage.e.r(context, R.string.iaResponseRarely, arrayList11, R.string.iaResponseSometimes, R.string.iaResponseOften);
                        arrayList11.add(context.getString(R.string.iaResponseAllthetime));
                        ((AssessmentQuestionOld) arrayList2.get(3)).setResponseOptions(arrayList11);
                        arrayList = new ArrayList();
                        String string41 = context.getString(R.string.completionHealth);
                        kotlin.jvm.internal.i.f(string41, "context.getString(R.string.completionHealth)");
                        arrayList.add(new AssessmentQuestionOld("AL", null, 9, string41, context.getString(R.string.nextAssessmentPromptThree), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
                        String string42 = context.getString(R.string.IndicatorAssessment);
                        kotlin.jvm.internal.i.f(string42, "context.getString(R.string.IndicatorAssessment)");
                        ArrayList h23 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string42, context.getString(R.string.sleepSymptomSeparator), new ArrayList(), null, false, 1, null, null));
                        defpackage.e.r(context, R.string.iaResponseStronglydisagree, h23, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
                        h23.add(context.getString(R.string.iaResponseAgree));
                        h23.add(context.getString(R.string.iaResponseStronglyagree));
                        String string43 = context.getString(R.string.sleepSymptomQ1);
                        kotlin.jvm.internal.i.f(string43, "context.getString(R.string.sleepSymptomQ1)");
                        ArrayList h24 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string43, null, h23, "S", false, 1, null, "Poor Lifestyle"));
                        defpackage.e.r(context, R.string.iaResponseExtremelyUntrue, h24, R.string.iaResponseUntrue, R.string.iaResponseUnsure);
                        h24.add(context.getString(R.string.iaResponseTrue));
                        h24.add(context.getString(R.string.iaResponseExtremelyTrue));
                        String string44 = context.getString(R.string.sleepSymptomQ2);
                        kotlin.jvm.internal.i.f(string44, "context.getString(R.string.sleepSymptomQ2)");
                        ArrayList h25 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string44, null, h24, "S", false, 1, null, "Poor Environment"));
                        defpackage.e.r(context, R.string.iaResponseNotatall, h25, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
                        h25.add(context.getString(R.string.iaResponseMostofthetime));
                        h25.add(context.getString(R.string.iaResponseAlways));
                        ArrayList arrayList12 = new ArrayList();
                        defpackage.e.r(context, R.string.iaResponseNever, arrayList12, R.string.iaResponseRarely, R.string.iaResponseSometimes);
                        arrayList12.add(context.getString(R.string.iaResponseOften));
                        arrayList12.add(context.getString(R.string.iaResponseAlways));
                        ArrayList arrayList13 = new ArrayList();
                        defpackage.e.r(context, R.string.iaResponseNotatall, arrayList13, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
                        arrayList13.add(context.getString(R.string.iaResponseMostofthetime));
                        arrayList13.add(context.getString(R.string.iaResponseAllthetime));
                        String string45 = context.getString(R.string.sleepSymptomQ3);
                        kotlin.jvm.internal.i.f(string45, "context.getString(R.string.sleepSymptomQ3)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string45, null, arrayList12, "S", false, 1, null, "Sleep Restriction"));
                        String string46 = context.getString(R.string.sleepSymptomQ4);
                        kotlin.jvm.internal.i.f(string46, "context.getString(R.string.sleepSymptomQ4)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string46, null, arrayList13, "S", false, 1, null, "Trouble Relaxing"));
                        String string47 = context.getString(R.string.sleepSymptomQ5);
                        kotlin.jvm.internal.i.f(string47, "context.getString(R.string.sleepSymptomQ5)");
                        ArrayList h26 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string47, null, arrayList12, "S", false, 1, null, "Negative Thoughts"));
                        defpackage.e.r(context, R.string.iaResponseNever, h26, R.string.iaResponseNotveryoften, R.string.iaResponseMaybesometimescomma);
                        h26.add(context.getString(R.string.iaResponseALotOfTheTime));
                        h26.add(context.getString(R.string.iaResponseAlways));
                        String string48 = context.getString(R.string.sleepSymptomQ6);
                        kotlin.jvm.internal.i.f(string48, "context.getString(R.string.sleepSymptomQ6)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string48, null, h26, "S", false, 1, null, "Trouble Falling Asleep"));
                        String string49 = context.getString(R.string.sleepSymptomQ7);
                        kotlin.jvm.internal.i.f(string49, "context.getString(R.string.sleepSymptomQ7)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string49, null, arrayList12, "S", false, 1, null, "Disrupted Sleep"));
                        String string50 = context.getString(R.string.sleepSymptomQ8);
                        kotlin.jvm.internal.i.f(string50, "context.getString(R.string.sleepSymptomQ8)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string50, null, h25, "S", false, 1, null, "Early Awakening"));
                        String string51 = context.getString(R.string.sleepSymptomQ9);
                        kotlin.jvm.internal.i.f(string51, "context.getString(R.string.sleepSymptomQ9)");
                        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string51, null, h26, "S", false, 1, null, "Lethargy"));
                        arrayList4 = P(context);
                        ((AssessmentQuestionOld) arrayList4.get(0)).setTitle(context.getString(R.string.nextAssessmentPromptSleepTitle));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setSubtitle(context.getString(R.string.nextAssessmentPromptSleep));
                        ((AssessmentQuestionOld) arrayList4.get(0)).setBtnText(context.getString(R.string.continue_text));
                        ((AssessmentQuestionOld) arrayList4.get(1)).setSubtitle(context.getString(R.string.sleepGlobalSeparator));
                        ((AssessmentQuestionOld) arrayList4.get(2)).setTitle(context.getString(R.string.sleepGlobalQ1));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setTitle(context.getString(R.string.allDone));
                        ((AssessmentQuestionOld) arrayList4.get(3)).setSubtitle(context.getString(R.string.completionAllSleep));
                        arrayList3 = arrayList;
                        break;
                    }
                    break;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        arrayList2 = Q(context);
                        String string52 = context.getString(R.string.anxietyAssessment);
                        kotlin.jvm.internal.i.f(string52, "context.getString(R.string.anxietyAssessment)");
                        arrayList2.set(0, new AssessmentQuestionOld("AL", null, 3, string52, context.getString(R.string.healthAssessmentPromptAnxiety), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
                        ArrayList<String> arrayList14 = new ArrayList<>();
                        defpackage.e.r(context, R.string.iaResponseRarely, arrayList14, R.string.iaResponseSometimes, R.string.iaResponseOften);
                        arrayList14.add(context.getString(R.string.iaResponseAllthetime));
                        ((AssessmentQuestionOld) arrayList2.get(3)).setResponseOptions(arrayList14);
                        arrayList3 = C(context);
                        arrayList4 = B(context);
                        break;
                    }
                    break;
            }
        }
        arrayList5.add(arrayList2);
        arrayList5.add(arrayList3);
        arrayList5.add(arrayList4);
        return arrayList5;
    }

    public static void A0(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                D0(parcel, parcelable, 0);
            }
        }
        C0(parcel, B0);
    }

    public static ArrayList B(Context context) {
        ArrayList P2 = P(context);
        ((AssessmentQuestionOld) P2.get(0)).setTitle(context.getString(R.string.completionSymptom));
        ((AssessmentQuestionOld) P2.get(0)).setSubtitle(context.getString(R.string.nextAssessmentPromptAnxiety));
        ((AssessmentQuestionOld) P2.get(0)).setBtnText(context.getString(R.string.continue_text));
        ((AssessmentQuestionOld) P2.get(1)).setSubtitle(context.getString(R.string.anxietyGlobalSeparator));
        ((AssessmentQuestionOld) P2.get(2)).setTitle(context.getString(R.string.anxietyGlobalQ1));
        ((AssessmentQuestionOld) P2.get(3)).setTitle(context.getString(R.string.allDoneName, FirebasePersistence.getInstance().getUser().getFirstName()));
        ((AssessmentQuestionOld) P2.get(3)).setSubtitle(context.getString(R.string.completionAllAnxiety));
        return P2;
    }

    public static int B0(Parcel parcel, int i6) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static ArrayList C(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.completionHealth);
        kotlin.jvm.internal.i.f(string, "context.getString(R.string.completionHealth)");
        arrayList.add(new AssessmentQuestionOld("AL", null, 9, string, context.getString(R.string.nextAssessmentPromptOne), new ArrayList(), null, false, 1, context.getString(R.string.continue_text), null));
        String string2 = context.getString(R.string.symptomAssessment);
        kotlin.jvm.internal.i.f(string2, "context.getString(R.string.symptomAssessment)");
        ArrayList h10 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string2, context.getString(R.string.anxietySymptomSeparator), new ArrayList(), null, false, 1, null, null));
        defpackage.e.r(context, R.string.iaResponseNotatall, h10, R.string.iaResponseNotveryoften, R.string.iaResponseMaybesometimescomma);
        h10.add(context.getString(R.string.iaResponseMostofthetime));
        h10.add(context.getString(R.string.iaResponseAllofthetime));
        ArrayList arrayList2 = new ArrayList();
        defpackage.e.r(context, R.string.iaResponseStronglydisagree, arrayList2, R.string.iaResponseDisagree, R.string.iaResponseNeutral);
        arrayList2.add(context.getString(R.string.iaResponseAgree));
        arrayList2.add(context.getString(R.string.iaResponseStronglyagree));
        String string3 = context.getString(R.string.anxietySymptomQ1);
        kotlin.jvm.internal.i.f(string3, "context.getString(R.string.anxietySymptomQ1)");
        ArrayList h11 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string3, null, arrayList2, "S", false, 1, null, "Excessive Worry"));
        defpackage.e.r(context, R.string.iaResponseExUntrue, h11, R.string.iaResponseUntrue, R.string.iaResponseUnsure);
        h11.add(context.getString(R.string.iaResponseTrue));
        h11.add(context.getString(R.string.iaResponseExTrue));
        String string4 = context.getString(R.string.anxietySymptomQ2);
        kotlin.jvm.internal.i.f(string4, "context.getString(R.string.anxietySymptomQ2)");
        ArrayList h12 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string4, null, h11, "S", false, 1, null, "Low Tolerance"));
        defpackage.e.r(context, R.string.iaResponseNever, h12, R.string.iaResponseRarely, R.string.iaResponseSometimes);
        h12.add(context.getString(R.string.iaResponseOften));
        h12.add(context.getString(R.string.iaResponseAlways));
        String string5 = context.getString(R.string.anxietySymptomQ3);
        kotlin.jvm.internal.i.f(string5, "context.getString(R.string.anxietySymptomQ3)");
        ArrayList h13 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 1, null, string5, null, h12, "S", false, 1, null, "Muscle Tension"));
        defpackage.e.r(context, R.string.iaResponseNotatall, h13, R.string.iaResponseHardlyever, R.string.iaResponseMaybesometimes);
        h13.add(context.getString(R.string.iaResponseMostofthetime));
        h13.add(context.getString(R.string.iaResponseAlways));
        String string6 = context.getString(R.string.anxietySymptomQ4);
        kotlin.jvm.internal.i.f(string6, "context.getString(R.string.anxietySymptomQ4)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string6, null, h13, "S", false, 1, null, "Lack of Focus"));
        String string7 = context.getString(R.string.anxietySymptomQ6);
        kotlin.jvm.internal.i.f(string7, "context.getString(R.string.anxietySymptomQ6)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string7, null, arrayList2, "S", false, 1, null, "Negative Thoughts"));
        String string8 = context.getString(R.string.anxietySymptomQ10);
        kotlin.jvm.internal.i.f(string8, "context.getString(R.string.anxietySymptomQ10)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string8, null, h11, "S", false, 1, null, "Mindlessness"));
        String string9 = context.getString(R.string.anxietySymptomQ7);
        kotlin.jvm.internal.i.f(string9, "context.getString(R.string.anxietySymptomQ7)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string9, null, h10, "S", false, 1, null, "Metaworry"));
        String string10 = context.getString(R.string.anxietySymptomQ8);
        kotlin.jvm.internal.i.f(string10, "context.getString(R.string.anxietySymptomQ8)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string10, null, h12, "S", false, 1, null, "Poor Problem Solving"));
        String string11 = context.getString(R.string.anxietySymptomQ9);
        kotlin.jvm.internal.i.f(string11, "context.getString(R.string.anxietySymptomQ9)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string11, null, h11, "S", false, 1, null, "Avoidance"));
        return arrayList;
    }

    public static void C0(Parcel parcel, int i6) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(dataPosition - i6);
        parcel.setDataPosition(dataPosition);
    }

    public static Integer D(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentHappiness);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentDepression);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentStress);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentAnger);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentSleep);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.color.onboardingAssessmentWorry);
                }
                break;
        }
        return null;
    }

    public static void D0(Parcel parcel, Parcelable parcelable, int i6) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i6);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static Integer E(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.color.csaHappinessBg);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.color.csaDepressionBg);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.color.csaStressBg);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.color.csaAngerBg);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.color.csaSleepBg);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.color.csaAnxietyBg);
                }
                break;
        }
        return null;
    }

    public static final dt.j F(b0 b0Var) {
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        dt.j o10 = b0Var.O0().o();
        kotlin.jvm.internal.i.f(o10, "constructor.builtIns");
        return o10;
    }

    public static int G(String course, String value) {
        kotlin.jvm.internal.i.g(course, "course");
        kotlin.jvm.internal.i.g(value, "value");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.happinessLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.happinessMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.happinessHigh;
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.depressionLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.depressionMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.depressionHigh;
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.stressLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.stressMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.stressHigh;
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.angerLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.angerMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.angerHigh;
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.sleepLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.sleepMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.sleepHigh;
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(value, "low")) {
                        return R.color.worryLow;
                    }
                    if (kotlin.jvm.internal.i.b(value, "mid")) {
                        return R.color.worryMid;
                    }
                    kotlin.jvm.internal.i.b(value, "high");
                    return R.color.worryHigh;
                }
                break;
        }
        return R.color.onboardingGrey;
    }

    public static Drawable H(Context context, int i6) {
        return b1.d().f(context, i6);
    }

    public static Integer I(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_happiness);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_depression);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_stress);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_anger);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_sleep);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.drawable.background_stroke_2dp_corner_12dp_worry);
                }
                break;
        }
        return null;
    }

    public static Integer J(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_happiness);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_depression);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_stress);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_anger);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_sleep);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.drawable.background_gradient_worry);
                }
                break;
        }
        return null;
    }

    public static int K(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return R.drawable.seekbar_solid_happiness;
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return R.drawable.seekbar_solid_depression;
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return R.drawable.seekbar_solid_stress;
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return R.drawable.seekbar_solid_anger;
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return R.drawable.seekbar_solid_sleep;
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return R.drawable.seekbar_solid_worry;
                }
                break;
        }
        return R.drawable.seekbar_solid_grey_stroke;
    }

    public static HashMap L(String str) {
        HashMap hashMap = new HashMap();
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    hashMap.put("gratitude", "Gratitude");
                    hashMap.put("mindfulness", "Mindfulness");
                    hashMap.put("social-skills", "Social Support");
                    hashMap.put("self-esteem", "Self-Competence");
                    hashMap.put("thought-work", "Balanced Thinking");
                    hashMap.put("physical-activity", "Physical Activity");
                    hashMap.put("relaxation", "Relaxation");
                    break;
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    hashMap.put("low-enjoyment", "Low Interest");
                    hashMap.put("low-energy", "Fatigue");
                    hashMap.put("lack-of-concentration", "Lack of Focus");
                    hashMap.put("low-self-esteem", "Low Self-esteem");
                    hashMap.put("negative-thoughts", "Negative Thoughts");
                    hashMap.put("anxiety", "Anxiety");
                    break;
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    hashMap.put("relaxation", "Trouble Relaxing");
                    hashMap.put("attention-training", "Lack of Focus");
                    hashMap.put("problem-solving", "Poor Problem Solving");
                    hashMap.put("assertiveness", "Communication Problems");
                    hashMap.put("thought-balancing", "Negative Thoughts");
                    hashMap.put("balancing-work-and-life", "Poor Work-Life Balance");
                    hashMap.put("health", "Poor Health");
                    break;
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    hashMap.put("understanding-anger", "Poor Understanding");
                    hashMap.put("self-calming", "Poor Self-Calming");
                    hashMap.put("mindfulness", "Trouble Being Mindful");
                    hashMap.put("overcoming-rumination", "Rumination");
                    hashMap.put("communication", "Communication Problems");
                    hashMap.put("thought-work", "Negative Thoughts");
                    hashMap.put("relaxation", "Trouble Relaxing");
                    break;
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    hashMap.put("sleep-hygiene", "Poor Hygiene");
                    hashMap.put(Constants.SCREEN_THOUGHTS, "Negative Thoughts");
                    hashMap.put("stimulus-control-and-sleep-restriction", "Sleep Restriction");
                    hashMap.put("relaxation", "Trouble Relaxing");
                    hashMap.put("mindfulness", "Trouble Being Mindful");
                    break;
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    hashMap.put("managing-worry", "Excessive Worry");
                    hashMap.put("tolerating-uncertainty", "Low Tolerance");
                    hashMap.put("relaxation", "Muscle Tension");
                    hashMap.put("focus-and-attention", "Lack of Focus");
                    hashMap.put("thought-work", "Negative Thoughts");
                    hashMap.put("problem-solving-and-overcoming-avoidance", "Poor Problem Solving");
                    hashMap.put("sleeping-well", "Poor Sleep");
                    break;
                }
                break;
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b0 M(v0 v0Var) {
        gt.e eVar;
        boolean z10;
        List<b0> upperBounds = v0Var.getUpperBounds();
        kotlin.jvm.internal.i.f(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<b0> upperBounds2 = v0Var.getUpperBounds();
        kotlin.jvm.internal.i.f(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            gt.g a10 = ((b0) next).O0().a();
            if (a10 instanceof gt.e) {
                eVar = (gt.e) a10;
            }
            if (eVar != null && eVar.j() != 2 && eVar.j() != 5) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                eVar = next;
                break;
            }
        }
        b0 b0Var = (b0) eVar;
        if (b0Var == null) {
            List<b0> upperBounds3 = v0Var.getUpperBounds();
            kotlin.jvm.internal.i.f(upperBounds3, "upperBounds");
            Object g22 = u.g2(upperBounds3);
            kotlin.jvm.internal.i.f(g22, "upperBounds.first()");
            return (b0) g22;
        }
        return b0Var;
    }

    public static HashMap N(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        HashMap hashMap = new HashMap();
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    hashMap.put("low", new xs.f(0, 14));
                    hashMap.put("mid", new xs.f(15, 29));
                    hashMap.put("high", new xs.f(30, 44));
                    break;
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    hashMap.put("low", new xs.f(0, 12));
                    hashMap.put("mid", new xs.f(13, 27));
                    hashMap.put("high", new xs.f(28, 40));
                    break;
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    hashMap.put("low", new xs.f(0, 14));
                    hashMap.put("mid", new xs.f(15, 29));
                    hashMap.put("high", new xs.f(30, 44));
                    break;
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    hashMap.put("low", new xs.f(0, 14));
                    hashMap.put("mid", new xs.f(15, 29));
                    hashMap.put("high", new xs.f(30, 44));
                    break;
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    hashMap.put("low", new xs.f(0, 11));
                    hashMap.put("mid", new xs.f(12, 24));
                    hashMap.put("high", new xs.f(25, 36));
                    break;
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    hashMap.put("low", new xs.f(0, 14));
                    hashMap.put("mid", new xs.f(15, 29));
                    hashMap.put("high", new xs.f(30, 44));
                    break;
                }
                break;
        }
        return hashMap;
    }

    public static Integer O(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.string.assessmentResultHappiness);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.string.assessmentResultDepression);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.string.assessmentResultStress);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.string.assessmentResultAnger);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.string.assessmentResultSleep);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.string.assessmentResultAnxiety);
                }
                break;
        }
        return null;
    }

    public static ArrayList P(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.completionSymptom);
        kotlin.jvm.internal.i.f(string, "context.getString(R.string.completionSymptom)");
        arrayList.add(new AssessmentQuestionOld("AL", null, 1, string, context.getString(R.string.nextAssessmentPromptStress), new ArrayList(), null, false, 2, context.getString(R.string.continue_text), null));
        String string2 = context.getString(R.string.globalAssessment);
        kotlin.jvm.internal.i.f(string2, "context.getString(R.string.globalAssessment)");
        ArrayList h10 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string2, context.getString(R.string.stressGlobalSeparator), new ArrayList(), null, false, 2, null, null));
        defpackage.e.r(context, R.string.iaResponseNoNever, h10, R.string.iaResponseRarely, R.string.iaResponseYesSometimes);
        h10.add(context.getString(R.string.iaResponseYesOften));
        h10.add(context.getString(R.string.iaResponseAlways));
        String string3 = context.getString(R.string.stressGlobalQ1);
        kotlin.jvm.internal.i.f(string3, "context.getString(R.string.stressGlobalQ1)");
        arrayList.add(new AssessmentQuestionOld("Q", 7, null, string3, null, h10, "G", false, 2, null, "G1"));
        String string4 = context.getString(R.string.allDone);
        kotlin.jvm.internal.i.f(string4, "context.getString(R.string.allDone)");
        arrayList.add(new AssessmentQuestionOld("AL", null, null, string4, context.getString(R.string.completionAllStress), new ArrayList(), null, false, 3, context.getString(R.string.viewResults), "G1"));
        return arrayList;
    }

    public static ArrayList Q(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.stressAssessment);
        kotlin.jvm.internal.i.f(string, "context.getString(R.string.stressAssessment)");
        arrayList.add(new AssessmentQuestionOld("AL", null, 3, string, context.getString(R.string.healthAssessmentPromptStress), new ArrayList(), null, false, 0, context.getString(R.string.initial_assessment_activity_btn), null));
        String string2 = context.getString(R.string.healthAssessment);
        kotlin.jvm.internal.i.f(string2, "context.getString(R.string.healthAssessment)");
        ArrayList h10 = defpackage.d.h(arrayList, new AssessmentQuestionOld("S", null, null, string2, context.getString(R.string.healthAssessmentExplanation), new ArrayList(), null, false, 0, null, null));
        h10.add(context.getString(R.string.iaResponseSleepMore));
        h10.add(context.getString(R.string.iaResponseSleepLess));
        h10.add(context.getString(R.string.iaResponseNoChanges));
        String string3 = context.getString(R.string.sleepQuestion);
        kotlin.jvm.internal.i.f(string3, "context.getString(R.string.sleepQuestion)");
        ArrayList h11 = defpackage.d.h(arrayList, new AssessmentQuestionOld("Q", 0, null, string3, null, h10, "H", true, 0, null, "H1"));
        defpackage.e.r(context, R.string.iaResponseRarely, h11, R.string.iaResponseSometimes, R.string.iaResponseOften);
        h11.add(context.getString(R.string.iaResponseAllthetime));
        String string4 = context.getString(R.string.frequencyPrompt);
        kotlin.jvm.internal.i.f(string4, "context.getString(R.string.frequencyPrompt)");
        ArrayList h12 = defpackage.d.h(arrayList, new AssessmentQuestionOld("SQ", 0, null, string4, null, h11, "H", false, 0, null, "H1"));
        h12.add(context.getString(R.string.iaResponseMoreAppetite));
        h12.add(context.getString(R.string.iaResponseLessAppetite));
        h12.add(context.getString(R.string.iaResponseNoChanges));
        String string5 = context.getString(R.string.appetiteQuestion);
        kotlin.jvm.internal.i.f(string5, "context.getString(R.string.appetiteQuestion)");
        arrayList.add(new AssessmentQuestionOld("Q", 1, null, string5, null, h12, "H", true, 0, null, "H2"));
        String string6 = context.getString(R.string.frequencyPrompt);
        kotlin.jvm.internal.i.f(string6, "context.getString(R.string.frequencyPrompt)");
        ArrayList h13 = defpackage.d.h(arrayList, new AssessmentQuestionOld("SQ", 1, null, string6, null, h11, "H", false, 0, null, "H2"));
        defpackage.e.r(context, R.string.iaResponseNotReally, h13, R.string.iaResponseMaybeLittle, R.string.iaResponseSomewhat);
        h13.add(context.getString(R.string.iaResponseQuiteBit));
        h13.add(context.getString(R.string.iaResponseALot));
        String string7 = context.getString(R.string.activeQuestion);
        kotlin.jvm.internal.i.f(string7, "context.getString(R.string.activeQuestion)");
        arrayList.add(new AssessmentQuestionOld("Q", 2, null, string7, context.getString(R.string.activePrompt), h13, "H", false, 0, null, "H3"));
        return arrayList;
    }

    public static final boolean R(v0 typeParameter, x0 x0Var, Set set) {
        boolean z10;
        kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
        List<b0> upperBounds = typeParameter.getUpperBounds();
        kotlin.jvm.internal.i.f(upperBounds, "typeParameter.upperBounds");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (b0 upperBound : upperBounds) {
            kotlin.jvm.internal.i.f(upperBound, "upperBound");
            if (l(upperBound, typeParameter.r().O0(), set) && (x0Var == null || kotlin.jvm.internal.i.b(upperBound.O0(), x0Var))) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(MotionEvent motionEvent, int i6) {
        if ((motionEvent.getSource() & i6) == i6) {
            return true;
        }
        return false;
    }

    public static final boolean T(zv.e eVar) {
        long j10;
        kotlin.jvm.internal.i.g(eVar, "<this>");
        try {
            zv.e eVar2 = new zv.e();
            long j11 = eVar.f39885v;
            if (j11 > 64) {
                j10 = 64;
            } else {
                j10 = j11;
            }
            eVar.j(eVar2, 0L, j10);
            int i6 = 0;
            while (i6 < 16) {
                i6++;
                if (!eVar2.B()) {
                    int p02 = eVar2.p0();
                    if (Character.isISOControl(p02) && !Character.isWhitespace(p02)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final boolean U(b0 b0Var, b0 superType) {
        kotlin.jvm.internal.i.g(superType, "superType");
        return xu.c.f38095a.d(b0Var, superType);
    }

    public static final boolean V(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        Pattern compile = Pattern.compile("^[-._~A-Za-z0-9]+$");
        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
        return compile.matcher(str).matches();
    }

    public static void X(Class klass, o.c cVar) {
        kotlin.jvm.internal.i.g(klass, "klass");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        kotlin.jvm.internal.i.f(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.i.f(annotation, "annotation");
            c0(cVar, annotation);
        }
        cVar.a();
    }

    public static final m1 Y(b0 b0Var) {
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        return k1.j(b0Var, true);
    }

    public static Integer Z(String course, String str) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(str, "gratitude")) {
                        return Integer.valueOf((int) R.string.happinessGratitudeSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.happinessMindfulnessSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "social-skills")) {
                        return Integer.valueOf((int) R.string.happinessSocialSupportSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "self-esteem")) {
                        return Integer.valueOf((int) R.string.happinessSelfCompetenceSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.happinessBalancedThinkingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "physical-activity")) {
                        return Integer.valueOf((int) R.string.happinessPhysicalActivitySymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.happinessRelaxationSymptom);
                    }
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(str, "low-enjoyment")) {
                        return Integer.valueOf((int) R.string.depressionLowInterestSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "low-energy")) {
                        return Integer.valueOf((int) R.string.depressionFatigueSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "lack-of-concentration")) {
                        return Integer.valueOf((int) R.string.depressionLackFocusSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "low-self-esteem")) {
                        return Integer.valueOf((int) R.string.depressionSelfEsteemSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "negative-thoughts")) {
                        return Integer.valueOf((int) R.string.depressionNegativeThoughtsSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "anxiety")) {
                        return Integer.valueOf((int) R.string.depressionAnxietySymptom);
                    }
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.stressTroubleRelaxingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "attention-training")) {
                        return Integer.valueOf((int) R.string.stressLackFocusSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "problem-solving")) {
                        return Integer.valueOf((int) R.string.stressProblemSolvingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "assertiveness")) {
                        return Integer.valueOf((int) R.string.stressCommunicationSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-balancing")) {
                        return Integer.valueOf((int) R.string.stressNegativeThoughtsSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "balancing-work-and-life")) {
                        return Integer.valueOf((int) R.string.stressWorkLifeSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "health")) {
                        return Integer.valueOf((int) R.string.stressPoorHealthSymptom);
                    }
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(str, "understanding-anger")) {
                        return Integer.valueOf((int) R.string.angerUnderstandingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "self-calming")) {
                        return Integer.valueOf((int) R.string.angerSelfCalmingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.angerMindfulSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "overcoming-rumination")) {
                        return Integer.valueOf((int) R.string.angerRuminationSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "communication")) {
                        return Integer.valueOf((int) R.string.angerCommunicationSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.angerNegativeThoughtsSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.angerTroubleRelaxingSymptom);
                    }
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(str, "sleep-hygiene")) {
                        return Integer.valueOf((int) R.string.sleepHygieneSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS)) {
                        return Integer.valueOf((int) R.string.sleepNegativeThoughtsSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "stimulus-control-and-sleep-restriction")) {
                        return Integer.valueOf((int) R.string.sleepRestrictionSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.sleepRelaxingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.sleepMindfulSymptom);
                    }
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(str, "managing-worry")) {
                        return Integer.valueOf((int) R.string.worryExcessSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "tolerating-uncertainty")) {
                        return Integer.valueOf((int) R.string.worryLowToleranceSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.worryMuscleTensionSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "focus-and-attention")) {
                        return Integer.valueOf((int) R.string.worryLackFocusSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.worryNegativeThoughtsSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "problem-solving-and-overcoming-avoidance")) {
                        return Integer.valueOf((int) R.string.worryProblemSolvingSymptom);
                    }
                    if (kotlin.jvm.internal.i.b(str, "sleeping-well")) {
                        return Integer.valueOf((int) R.string.worryPoorSleepSymptom);
                    }
                }
                break;
        }
        return null;
    }

    public static Integer a0(String course, String str) {
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(str, "gratitude")) {
                        return Integer.valueOf((int) R.string.happinessGratitude);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.happinessMindfulness);
                    }
                    if (kotlin.jvm.internal.i.b(str, "social-skills")) {
                        return Integer.valueOf((int) R.string.happinessSocialSupport);
                    }
                    if (kotlin.jvm.internal.i.b(str, "self-esteem")) {
                        return Integer.valueOf((int) R.string.happinessSelfCompetence);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.happinessBalancedThinking);
                    }
                    if (kotlin.jvm.internal.i.b(str, "physical-activity")) {
                        return Integer.valueOf((int) R.string.happinessPhysicalActivity);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.happinessRelaxation);
                    }
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(str, "low-enjoyment")) {
                        return Integer.valueOf((int) R.string.depressionLowInterest);
                    }
                    if (kotlin.jvm.internal.i.b(str, "low-energy")) {
                        return Integer.valueOf((int) R.string.depressionFatigue);
                    }
                    if (kotlin.jvm.internal.i.b(str, "lack-of-concentration")) {
                        return Integer.valueOf((int) R.string.depressionLackFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str, "low-self-esteem")) {
                        return Integer.valueOf((int) R.string.depressionSelfEsteem);
                    }
                    if (kotlin.jvm.internal.i.b(str, "negative-thoughts")) {
                        return Integer.valueOf((int) R.string.depressionNegativeThoughts);
                    }
                    if (kotlin.jvm.internal.i.b(str, "anxiety")) {
                        return Integer.valueOf((int) R.string.depressionAnxiety);
                    }
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.stressTroubleRelaxing);
                    }
                    if (kotlin.jvm.internal.i.b(str, "attention-training")) {
                        return Integer.valueOf((int) R.string.stressLackFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str, "problem-solving")) {
                        return Integer.valueOf((int) R.string.stressProblemSolving);
                    }
                    if (kotlin.jvm.internal.i.b(str, "assertiveness")) {
                        return Integer.valueOf((int) R.string.stressCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-balancing")) {
                        return Integer.valueOf((int) R.string.stressNegativeThoughts);
                    }
                    if (kotlin.jvm.internal.i.b(str, "balancing-work-and-life")) {
                        return Integer.valueOf((int) R.string.stressWorkLife);
                    }
                    if (kotlin.jvm.internal.i.b(str, "health")) {
                        return Integer.valueOf((int) R.string.stressPoorHealth);
                    }
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(str, "understanding-anger")) {
                        return Integer.valueOf((int) R.string.angerUnderstanding);
                    }
                    if (kotlin.jvm.internal.i.b(str, "self-calming")) {
                        return Integer.valueOf((int) R.string.angerSelfCalming);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.angerMindful);
                    }
                    if (kotlin.jvm.internal.i.b(str, "overcoming-rumination")) {
                        return Integer.valueOf((int) R.string.angerRumination);
                    }
                    if (kotlin.jvm.internal.i.b(str, "communication")) {
                        return Integer.valueOf((int) R.string.angerCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.angerNegativeThoughts);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.angerTroubleRelaxing);
                    }
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(str, "sleep-hygiene")) {
                        return Integer.valueOf((int) R.string.sleepHygiene);
                    }
                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS)) {
                        return Integer.valueOf((int) R.string.sleepNegativeThoughts);
                    }
                    if (kotlin.jvm.internal.i.b(str, "stimulus-control-and-sleep-restriction")) {
                        return Integer.valueOf((int) R.string.sleepRestriction);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.sleepRelaxing);
                    }
                    if (kotlin.jvm.internal.i.b(str, "mindfulness")) {
                        return Integer.valueOf((int) R.string.sleepMindful);
                    }
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(str, "managing-worry")) {
                        return Integer.valueOf((int) R.string.worryExcess);
                    }
                    if (kotlin.jvm.internal.i.b(str, "tolerating-uncertainty")) {
                        return Integer.valueOf((int) R.string.worryLowTolerance);
                    }
                    if (kotlin.jvm.internal.i.b(str, "relaxation")) {
                        return Integer.valueOf((int) R.string.worryMuscleTension);
                    }
                    if (kotlin.jvm.internal.i.b(str, "focus-and-attention")) {
                        return Integer.valueOf((int) R.string.worryLackFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str, "thought-work")) {
                        return Integer.valueOf((int) R.string.worryNegativeThoughts);
                    }
                    if (kotlin.jvm.internal.i.b(str, "problem-solving-and-overcoming-avoidance")) {
                        return Integer.valueOf((int) R.string.worryProblemSolving);
                    }
                    if (kotlin.jvm.internal.i.b(str, "sleeping-well")) {
                        return Integer.valueOf((int) R.string.worryPoorSleep);
                    }
                }
                break;
        }
        return null;
    }

    public static final Object b0(Object obj, kotlinx.coroutines.internal.g gVar) {
        if (obj == null) {
            return gVar;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(gVar);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(gVar);
        return arrayList;
    }

    public static void c0(o.c cVar, Annotation annotation) {
        Class C2 = sp.b.C(sp.b.r(annotation));
        o.a b10 = cVar.b(nt.d.a(C2), new mt.a(annotation));
        if (b10 != null) {
            d0(b10, annotation, C2);
        }
    }

    public static float d(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static void d0(o.a aVar, Annotation annotation, Class cls) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.i.f(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                kotlin.jvm.internal.i.d(invoke);
                fu.e j10 = fu.e.j(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (kotlin.jvm.internal.i.b(cls2, Class.class)) {
                    aVar.e(j10, k((Class) invoke));
                } else if (mt.e.f25741a.contains(cls2)) {
                    aVar.b(invoke, j10);
                } else {
                    List<ys.d<? extends Object>> list = nt.d.f26795a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        kotlin.jvm.internal.i.f(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        aVar.f(j10, nt.d.a(cls2), fu.e.j(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        kotlin.jvm.internal.i.f(interfaces, "clazz.interfaces");
                        Class annotationClass = (Class) is.k.e2(interfaces);
                        kotlin.jvm.internal.i.f(annotationClass, "annotationClass");
                        o.a d10 = aVar.d(nt.d.a(annotationClass), j10);
                        if (d10 != null) {
                            d0(d10, (Annotation) invoke, annotationClass);
                        }
                    } else if (cls2.isArray()) {
                        o.b c10 = aVar.c(j10);
                        if (c10 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                fu.b a10 = nt.d.a(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    c10.e(a10, fu.e.j(((Enum) obj).name()));
                                }
                            } else if (kotlin.jvm.internal.i.b(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    c10.b(k((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    o.a c11 = c10.c(nt.d.a(componentType));
                                    if (c11 != null) {
                                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        d0(c11, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    c10.d(obj4);
                                }
                            }
                            c10.a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public static float e(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void e0(Bundle bundle, String str, o7.a aVar) {
        if (w.f5205a >= 18) {
            bundle.putBinder(str, aVar);
            return;
        }
        Method method = C;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                C = method2;
                method2.setAccessible(true);
                method = C;
            } catch (NoSuchMethodException e10) {
                Log.i("BundleUtil", ca.a.i("Failed to retrieve putIBinder method", e10));
                return;
            }
        }
        try {
            method.invoke(bundle, str, aVar);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            Log.i("BundleUtil", ca.a.i("Failed to invoke putIBinder via reflection", e11));
        }
    }

    public static final int f(WorkDatabase workDatabase, String str) {
        int i6;
        Long b10 = workDatabase.q().b(str);
        int i10 = 0;
        if (b10 != null) {
            i6 = (int) b10.longValue();
        } else {
            i6 = 0;
        }
        if (i6 != Integer.MAX_VALUE) {
            i10 = i6 + 1;
        }
        workDatabase.q().a(new v2.d(str, Long.valueOf(i10)));
        return i6;
    }

    public static final b0 f0(b0 b0Var, ht.h hVar) {
        if (b0Var.getAnnotations().isEmpty() && hVar.isEmpty()) {
            return b0Var;
        }
        return b0Var.R0().U0(ca.a.g1(b0Var.N0(), hVar));
    }

    public static final f1 g(b0 b0Var) {
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        return new f1(b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [wu.m1] */
    public static final m1 g0(b0 b0Var) {
        i0 i0Var;
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        m1 R0 = b0Var.R0();
        if (R0 instanceof v) {
            v vVar = (v) R0;
            i0 i0Var2 = vVar.f37298v;
            if (!i0Var2.O0().getParameters().isEmpty() && i0Var2.O0().a() != null) {
                List<v0> parameters = i0Var2.O0().getParameters();
                kotlin.jvm.internal.i.f(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
                for (v0 v0Var : parameters) {
                    arrayList.add(new n0(v0Var));
                }
                i0Var2 = kotlin.jvm.internal.h.d0(i0Var2, arrayList, null, 2);
            }
            i0 i0Var3 = vVar.f37299w;
            if (!i0Var3.O0().getParameters().isEmpty() && i0Var3.O0().a() != null) {
                List<v0> parameters2 = i0Var3.O0().getParameters();
                kotlin.jvm.internal.i.f(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(is.i.H1(parameters2, 10));
                for (v0 v0Var2 : parameters2) {
                    arrayList2.add(new n0(v0Var2));
                }
                i0Var3 = kotlin.jvm.internal.h.d0(i0Var3, arrayList2, null, 2);
            }
            i0Var = c0.c(i0Var2, i0Var3);
        } else if (R0 instanceof i0) {
            i0 i0Var4 = (i0) R0;
            boolean isEmpty = i0Var4.O0().getParameters().isEmpty();
            i0Var = i0Var4;
            if (!isEmpty) {
                gt.g a10 = i0Var4.O0().a();
                i0Var = i0Var4;
                if (a10 != null) {
                    List<v0> parameters3 = i0Var4.O0().getParameters();
                    kotlin.jvm.internal.i.f(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(is.i.H1(parameters3, 10));
                    for (v0 v0Var3 : parameters3) {
                        arrayList3.add(new n0(v0Var3));
                    }
                    i0Var = kotlin.jvm.internal.h.d0(i0Var4, arrayList3, null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ca.a.B0(i0Var, R0);
    }

    public static dg.a h0(int i6, dg.a aVar) {
        dg.a aVar2 = new dg.a();
        int i10 = aVar.f12845v;
        int i11 = (1 << i6) - 2;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i6; i14++) {
                int i15 = i12 + i14;
                if (i15 >= i10 || aVar.d(i15)) {
                    i13 |= 1 << ((i6 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.b(i16, i6);
            } else if (i16 == 0) {
                aVar2.b(i13 | 1, i6);
            } else {
                aVar2.b(i13, i6);
                i12 += i6;
            }
            i12--;
            i12 += i6;
        }
        return aVar2;
    }

    public static void i(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw ParserException.a(str, null);
    }

    public static final String i0(String str) {
        boolean z10;
        InetAddress q10;
        kotlin.jvm.internal.i.g(str, "<this>");
        int i6 = 0;
        int i10 = -1;
        if (gv.r.J0(str, ":")) {
            if (n.H0(str, "[") && n.z0(str, "]")) {
                q10 = q(1, str.length() - 1, str);
            } else {
                q10 = q(0, str.length(), str);
            }
            if (q10 == null) {
                return null;
            }
            byte[] address = q10.getAddress();
            if (address.length == 16) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < address.length) {
                    int i13 = i11;
                    while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                        i13 += 2;
                    }
                    int i14 = i13 - i11;
                    if (i14 > i12 && i14 >= 4) {
                        i10 = i11;
                        i12 = i14;
                    }
                    i11 = i13 + 2;
                }
                zv.e eVar = new zv.e();
                while (i6 < address.length) {
                    if (i6 == i10) {
                        eVar.L0(58);
                        i6 += i12;
                        if (i6 == 16) {
                            eVar.L0(58);
                        }
                    } else {
                        if (i6 > 0) {
                            eVar.L0(58);
                        }
                        byte b10 = address[i6];
                        byte[] bArr = mv.b.f25755a;
                        eVar.N0(((b10 & 255) << 8) | (address[i6 + 1] & 255));
                        i6 += 2;
                    }
                }
                return eVar.k0();
            } else if (address.length == 4) {
                return q10.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        try {
            String ascii = IDN.toASCII(str);
            kotlin.jvm.internal.i.f(ascii, "toASCII(host)");
            Locale US = Locale.US;
            kotlin.jvm.internal.i.f(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int length = lowerCase.length();
            int i15 = 0;
            while (i15 < length) {
                int i16 = i15 + 1;
                char charAt = lowerCase.charAt(i15);
                if (kotlin.jvm.internal.i.i(charAt, 31) > 0 && kotlin.jvm.internal.i.i(charAt, 127) < 0 && gv.r.N0(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                    i15 = i16;
                }
                i6 = 1;
                break;
            }
            if (i6 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int j(int i6, int i10, int i11) {
        if (i6 < i10) {
            return i10;
        }
        if (i6 > i11) {
            return i11;
        }
        return i6;
    }

    public static String j0(int i6) {
        return w.k("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i6)), Integer.valueOf(Color.green(i6)), Integer.valueOf(Color.blue(i6)), Double.valueOf(Color.alpha(i6) / 255.0d));
    }

    public static ku.f k(Class cls) {
        int i6 = 0;
        while (cls.isArray()) {
            i6++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.i.f(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (kotlin.jvm.internal.i.b(cls, Void.TYPE)) {
                return new ku.f(fu.b.l(n.a.f13400d.h()), i6);
            }
            dt.k i10 = nu.c.f(cls.getName()).i();
            kotlin.jvm.internal.i.f(i10, "get(currentClass.name).primitiveType");
            if (i6 > 0) {
                return new ku.f(fu.b.l((fu.c) i10.f13373x.getValue()), i6 - 1);
            }
            return new ku.f(fu.b.l((fu.c) i10.f13372w.getValue()), i6);
        }
        fu.b a10 = nt.d.a(cls);
        String str = ft.c.f15851a;
        fu.c b10 = a10.b();
        kotlin.jvm.internal.i.f(b10, "javaClassId.asSingleFqName()");
        fu.b f = ft.c.f(b10);
        if (f != null) {
            a10 = f;
        }
        return new ku.f(a10, i6);
    }

    public static final int k0(char c10) {
        boolean z10;
        int digit = Character.digit(c10, 16);
        if (digit != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return digit;
        }
        throw new IllegalArgumentException(("Invalid Hexadecimal Character: " + c10).toString());
    }

    public static final boolean l(b0 b0Var, x0 x0Var, Set set) {
        gt.h hVar;
        List<v0> list;
        v0 v0Var;
        boolean z10;
        boolean z11;
        if (kotlin.jvm.internal.i.b(b0Var.O0(), x0Var)) {
            return true;
        }
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof gt.h) {
            hVar = (gt.h) a10;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            list = hVar.t();
        } else {
            list = null;
        }
        is.a0 N2 = u.N2(b0Var.M0());
        if (!(N2 instanceof Collection) || !((Collection) N2).isEmpty()) {
            Iterator it = N2.iterator();
            do {
                is.b0 b0Var2 = (is.b0) it;
                if (b0Var2.hasNext()) {
                    z zVar = (z) b0Var2.next();
                    int i6 = zVar.f20679a;
                    d1 d1Var = (d1) zVar.f20680b;
                    if (list != null) {
                        v0Var = (v0) u.j2(i6, list);
                    } else {
                        v0Var = null;
                    }
                    if (v0Var != null && set != null && set.contains(v0Var)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !d1Var.d()) {
                        b0 a11 = d1Var.a();
                        kotlin.jvm.internal.i.f(a11, "argument.type");
                        z11 = l(a11, x0Var, set);
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                }
            } while (!z11);
            return true;
        }
        return false;
    }

    public static final Object l0(Object obj) {
        JSONArray jSONArray;
        if (obj instanceof Map) {
            return m0((Map) obj);
        }
        if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            if (collection != null) {
                jSONArray = new JSONArray();
                for (Object obj2 : collection) {
                    jSONArray.put(l0(obj2));
                }
                return jSONArray;
            }
            return null;
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null) {
                jSONArray = new JSONArray();
                is.b0 N2 = kotlin.jvm.internal.h.N(objArr);
                while (N2.hasNext()) {
                    jSONArray.put(l0(N2.next()));
                }
                return jSONArray;
            }
            return null;
        } else {
            return obj;
        }
    }

    public static b m(Context context) {
        qd qdVar;
        synchronized (d.class) {
            if (f17369u == null) {
                x xVar = new x();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                z3 z3Var = new z3(context);
                xVar.f16143v = z3Var;
                f17369u = new qd(z3Var);
            }
            qdVar = f17369u;
        }
        return (b) ((ic.c) qdVar.B).a();
    }

    public static final JSONObject m0(Map map) {
        String str;
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                str = (String) key;
            } else {
                str = null;
            }
            if (str != null) {
                jSONObject.put(str, l0(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final f1 n(b0 type, n1 n1Var, v0 v0Var) {
        n1 n1Var2;
        kotlin.jvm.internal.i.g(type, "type");
        if (v0Var != null) {
            n1Var2 = v0Var.O();
        } else {
            n1Var2 = null;
        }
        if (n1Var2 == n1Var) {
            n1Var = n1.INVARIANT;
        }
        return new f1(type, n1Var);
    }

    public static final LinkedHashMap n0(JSONObject jSONObject) {
        kotlin.jvm.internal.i.g(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.i.f(keys, "this.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            kotlin.jvm.internal.i.f(key, "key");
            linkedHashMap.put(key, x(jSONObject.get(key)));
        }
        return linkedHashMap;
    }

    public static String o(String str) {
        StringBuilder n10 = defpackage.e.n(ri.e.c(str, ri.e.c(str, 5)), ".", str, ",.", str);
        n10.append(" *");
        return n10.toString();
    }

    public static void o0(Parcel parcel, int i6, boolean z10) {
        parcel.writeInt(i6 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static final byte[] p(String str) {
        boolean z10;
        if (str.length() % 2 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = new byte[str.length() / 2];
            int i6 = 0;
            while (i6 < str.length()) {
                int i10 = i6 / 2;
                int i11 = i6 + 2;
                String substring = str.substring(i6, i11);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                bArr[i10] = (byte) ((k0(substring.charAt(0)) << 4) + k0(substring.charAt(1)));
                i6 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Invalid hexadecimal String supplied.".toString());
    }

    public static void p0(Parcel parcel, int i6, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeBundle(bundle);
        C0(parcel, B0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
        if (r7 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e1, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress q(int i6, int i10, String str) {
        boolean z10;
        int i11;
        int i12 = 16;
        byte[] bArr = new byte[16];
        boolean z11 = false;
        int i13 = -1;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        int i17 = i6;
        while (true) {
            if (i17 < i10) {
                if (i14 == i12) {
                    return null;
                }
                int i18 = i17 + 2;
                if (i18 <= i10 && gv.n.G0(i17, str, "::", z11)) {
                    if (i15 != i13) {
                        return null;
                    }
                    i14 += 2;
                    i15 = i14;
                    if (i18 != i10) {
                        i16 = i18;
                        i17 = i16;
                        int i19 = 0;
                        while (i17 < i10) {
                        }
                        i11 = i17 - i16;
                        if (i11 == 0) {
                            break;
                        }
                        break;
                    }
                    break;
                }
                if (i14 != 0) {
                    if (gv.n.G0(i17, str, ":", z11)) {
                        i17++;
                    } else if (!gv.n.G0(i17, str, ".", z11)) {
                        return null;
                    } else {
                        int i20 = i14 - 2;
                        int i21 = i20;
                        loop2: while (true) {
                            if (i16 < i10) {
                                if (i21 == i12) {
                                    break;
                                }
                                if (i21 != i20) {
                                    if (str.charAt(i16) != '.') {
                                        break;
                                    }
                                    i16++;
                                }
                                int i22 = i16;
                                int i23 = 0;
                                while (i22 < i10) {
                                    char charAt = str.charAt(i22);
                                    if (kotlin.jvm.internal.i.i(charAt, 48) < 0 || kotlin.jvm.internal.i.i(charAt, 57) > 0) {
                                        break;
                                    } else if ((i23 == 0 && i16 != i22) || (i23 = ((i23 * 10) + charAt) - 48) > 255) {
                                        break loop2;
                                    } else {
                                        i22++;
                                    }
                                }
                                if (i22 - i16 == 0) {
                                    break;
                                }
                                bArr[i21] = (byte) i23;
                                i21++;
                                i16 = i22;
                                i12 = 16;
                            } else if (i21 == i20 + 4) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                        if (!z10) {
                            return null;
                        }
                        i14 += 2;
                    }
                }
                i16 = i17;
                i17 = i16;
                int i192 = 0;
                while (i17 < i10) {
                    int r = mv.b.r(str.charAt(i17));
                    if (r == -1) {
                        break;
                    }
                    i192 = (i192 << 4) + r;
                    i17++;
                }
                i11 = i17 - i16;
                if (i11 == 0 || i11 > 4) {
                    break;
                }
                int i24 = i14 + 1;
                bArr[i14] = (byte) ((i192 >>> 8) & 255);
                i14 = i24 + 1;
                bArr[i24] = (byte) (i192 & 255);
                i12 = 16;
                z11 = false;
                i13 = -1;
            } else {
                break;
            }
        }
        return null;
    }

    public static void q0(Parcel parcel, int i6, double d10) {
        parcel.writeInt(i6 | 524288);
        parcel.writeDouble(d10);
    }

    public static void r(dg.b bVar, int i6, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 2) {
            int i12 = i6 - i11;
            int i13 = i12;
            while (true) {
                int i14 = i6 + i11;
                if (i13 <= i14) {
                    bVar.b(i13, i12);
                    bVar.b(i13, i14);
                    bVar.b(i12, i13);
                    bVar.b(i14, i13);
                    i13++;
                }
            }
        }
        int i15 = i6 - i10;
        bVar.b(i15, i15);
        int i16 = i15 + 1;
        bVar.b(i16, i15);
        bVar.b(i15, i16);
        int i17 = i6 + i10;
        bVar.b(i17, i15);
        bVar.b(i17, i16);
        bVar.b(i17, i17 - 1);
    }

    public static void r0(Parcel parcel, int i6, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeStrongBinder(iBinder);
        C0(parcel, B0);
    }

    public static void s() {
        int i6 = f17370v;
        if (i6 > 0) {
            f17370v = i6 - 1;
        }
    }

    public static void s0(Parcel parcel, int i6, int i10) {
        parcel.writeInt(i6 | 262144);
        parcel.writeInt(i10);
    }

    public static String t(com.google.protobuf.h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i6 = 0; i6 < hVar.size(); i6++) {
            byte m10 = hVar.m(i6);
            if (m10 != 34) {
                if (m10 != 39) {
                    if (m10 != 92) {
                        switch (m10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (m10 >= 32 && m10 <= 126) {
                                    sb2.append((char) m10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((m10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((m10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((m10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static void t0(Parcel parcel, int i6, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeIntArray(iArr);
        C0(parcel, B0);
    }

    public static int u(float f, int i6, int i10) {
        if (i6 == i10) {
            return i6;
        }
        float f2 = ((i6 >> 24) & 255) / 255.0f;
        float d10 = d(((i6 >> 16) & 255) / 255.0f);
        float d11 = d(((i6 >> 8) & 255) / 255.0f);
        float d12 = d((i6 & 255) / 255.0f);
        float d13 = d(((i10 >> 16) & 255) / 255.0f);
        float d14 = d(((i10 >> 8) & 255) / 255.0f);
        float d15 = d((i10 & 255) / 255.0f);
        float e10 = defpackage.e.e(((i10 >> 24) & 255) / 255.0f, f2, f, f2);
        float e11 = defpackage.e.e(d13, d10, f, d10);
        float e12 = defpackage.e.e(d14, d11, f, d11);
        float e13 = defpackage.e.e(d15, d12, f, d12);
        int round = Math.round(e(e11) * 255.0f) << 16;
        return Math.round(e(e13) * 255.0f) | round | (Math.round(e10 * 255.0f) << 24) | (Math.round(e(e12) * 255.0f) << 8);
    }

    public static void u0(Parcel parcel, int i6, long j10) {
        parcel.writeInt(i6 | 524288);
        parcel.writeLong(j10);
    }

    public static final void v(b0 b0Var, i0 i0Var, LinkedHashSet linkedHashSet, Set set) {
        gt.h hVar;
        List<v0> list;
        v0 v0Var;
        boolean z10;
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof v0) {
            if (!kotlin.jvm.internal.i.b(b0Var.O0(), i0Var.O0())) {
                linkedHashSet.add(a10);
                return;
            }
            for (b0 upperBound : ((v0) a10).getUpperBounds()) {
                kotlin.jvm.internal.i.f(upperBound, "upperBound");
                v(upperBound, i0Var, linkedHashSet, set);
            }
            return;
        }
        gt.g a11 = b0Var.O0().a();
        if (a11 instanceof gt.h) {
            hVar = (gt.h) a11;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            list = hVar.t();
        } else {
            list = null;
        }
        int i6 = 0;
        for (d1 d1Var : b0Var.M0()) {
            int i10 = i6 + 1;
            if (list != null) {
                v0Var = (v0) u.j2(i6, list);
            } else {
                v0Var = null;
            }
            if (v0Var != null && set != null && set.contains(v0Var)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !d1Var.d() && !u.Z1(linkedHashSet, d1Var.a().O0().a()) && !kotlin.jvm.internal.i.b(d1Var.a().O0(), i0Var.O0())) {
                b0 a12 = d1Var.a();
                kotlin.jvm.internal.i.f(a12, "argument.type");
                v(a12, i0Var, linkedHashSet, set);
            }
            i6 = i10;
        }
    }

    public static void v0(Parcel parcel, int i6, Long l2) {
        if (l2 == null) {
            return;
        }
        parcel.writeInt(i6 | 524288);
        parcel.writeLong(l2.longValue());
    }

    public static View w(int i6, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View findViewById = viewGroup.getChildAt(i10).findViewById(i6);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static void w0(Parcel parcel, int i6, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcelable.writeToParcel(parcel, i10);
        C0(parcel, B0);
    }

    public static final Object x(Object obj) {
        if (obj instanceof JSONObject) {
            return n0((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            kotlin.jvm.internal.i.g(jSONArray, "<this>");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    arrayList.add(x(jSONArray.get(i6)));
                    if (i10 >= length) {
                        break;
                    }
                    i6 = i10;
                }
            }
            return arrayList;
        } else if (obj instanceof BigDecimal) {
            return Double.valueOf(((BigDecimal) obj).doubleValue());
        } else {
            if (kotlin.jvm.internal.i.b(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
    }

    public static void x0(Parcel parcel, int i6, String str) {
        if (str == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeString(str);
        C0(parcel, B0);
    }

    public static dg.a y(dg.a aVar, int i6, int i10) {
        eg.a aVar2;
        int i11;
        int i12 = aVar.f12845v / i10;
        if (i10 != 4) {
            if (i10 != 6) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 == 12) {
                            aVar2 = eg.a.f13957g;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
                        }
                    } else {
                        aVar2 = eg.a.f13958h;
                    }
                } else {
                    aVar2 = eg.a.f13962l;
                }
            } else {
                aVar2 = eg.a.f13959i;
            }
        } else {
            aVar2 = eg.a.f13960j;
        }
        nd.z zVar = new nd.z(aVar2);
        int i13 = i6 / i10;
        int[] iArr = new int[i13];
        int i14 = aVar.f12845v / i10;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (aVar.d((i15 * i10) + i17)) {
                    i11 = 1 << ((i10 - i17) - 1);
                } else {
                    i11 = 0;
                }
                i16 |= i11;
            }
            iArr[i15] = i16;
        }
        zVar.f(iArr, i13 - i12);
        dg.a aVar3 = new dg.a();
        aVar3.b(0, i6 % i10);
        for (int i18 = 0; i18 < i13; i18++) {
            aVar3.b(iArr[i18], i10);
        }
        return aVar3;
    }

    public static void y0(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeStringList(list);
        C0(parcel, B0);
    }

    public static final String z(String codeVerifier) {
        kotlin.jvm.internal.i.g(codeVerifier, "codeVerifier");
        if (V(codeVerifier)) {
            try {
                byte[] bytes = codeVerifier.getBytes(gv.a.f16928c);
                kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                kotlin.jvm.internal.i.f(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new FacebookException(e10);
            }
        }
        throw new FacebookException("Invalid Code Verifier.");
    }

    public static void z0(Parcel parcel, int i6, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int B0 = B0(parcel, i6);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                D0(parcel, parcelable, i10);
            }
        }
        C0(parcel, B0);
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        boolean z10 = true;
        if (cVar.J() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        float s10 = (float) cVar.s();
        float s11 = (float) cVar.s();
        while (cVar.m()) {
            cVar.e0();
        }
        if (z10) {
            cVar.g();
        }
        return new n3.c((s10 / 100.0f) * f, (s11 / 100.0f) * f);
    }

    @Override // mc.a
    public /* synthetic */ Object a() {
        return new mc.g("IntegrityService");
    }

    @Override // m4.a
    public File c(h4.e eVar) {
        return null;
    }

    @Override // ya.g
    public ya.h h(Object obj) {
        boolean z10;
        Bundle bundle = (Bundle) obj;
        int i6 = r9.c.f30607h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return ya.k.e(null);
        }
        return ya.k.e(bundle);
    }

    @Override // ya.b
    public Object then(ya.h hVar) {
        if (!hVar.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", hVar.getException());
            return null;
        }
        return null;
    }

    @Override // m4.a
    public void b(h4.e eVar, k4.g gVar) {
    }
}
