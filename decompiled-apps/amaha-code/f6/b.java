package f6;

import a7.e;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bg.d;
import c4.g;
import c4.o;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.p2;
import com.google.android.gms.internal.cast.q2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.r2;
import com.google.android.gms.internal.measurement.l8;
import com.google.common.base.VerifyException;
import com.moengage.core.exceptions.SdkNotInitializedException;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import di.l;
import dv.b;
import gt.v0;
import gv.n;
import ih.p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import k3.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.r;
import org.json.JSONArray;
import org.json.JSONObject;
import qg.w;
import t0.d0;
import t0.h0;
import t0.o0;
import ta.h2;
import ta.j2;
import ta.v;
import v.h;
import wu.d1;
import wu.f1;
import wu.i0;
import wu.m1;
import wu.t;
import wu.x0;
import xu.a;
import yb.f;
import zu.c;
import zu.j;
import zu.k;
import zu.m;
/* compiled from: OidcSecurityUtil.kt */
/* loaded from: classes.dex */
public final class b implements d, b.InterfaceC0206b, a0, e, ya.b, o, h2, xu.a {

    /* renamed from: u  reason: collision with root package name */
    public static final char[] f14866u = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: v  reason: collision with root package name */
    public static final char[] f14867v = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f14868w = {"_id", "attribute_name", "attribute_value"};

    /* renamed from: x  reason: collision with root package name */
    public static final b f14869x = new b();

    /* renamed from: y  reason: collision with root package name */
    public static final b f14870y = new b();

    /* renamed from: z  reason: collision with root package name */
    public static final b f14871z = new b();
    public static final b A = new b();
    public static final b B = new b();
    public static final int[][] C = {new int[]{120256, 125680, 128380, 120032, 125560, 128318, 108736, 119920, 108640, 86080, 108592, 86048, 110016, 120560, 125820, 109792, 120440, 125758, 88256, 109680, 88160, 89536, 110320, 120700, 89312, 110200, 120638, 89200, 110140, 89840, 110460, 89720, 110398, 89980, 128506, 119520, 125304, 128190, 107712, 119408, 125244, 107616, 119352, 84032, 107568, 119324, 84000, 107544, 83984, 108256, 119672, 125374, 85184, 108144, 119612, 85088, 108088, 119582, 85040, 108060, 85728, 108408, 119742, 85616, 108348, 85560, 108318, 85880, 108478, 85820, 85790, 107200, 119152, 125116, 107104, 119096, 125086, 83008, 107056, 119068, 82976, 107032, 82960, 82952, 83648, 107376, 119228, 83552, 107320, 119198, 83504, 107292, 83480, 83468, 83824, 107452, 83768, 107422, 83740, 83900, 106848, 118968, 125022, 82496, 106800, 118940, 82464, 106776, 118926, 82448, 106764, 82440, 106758, 82784, 106936, 119006, 82736, 106908, 82712, 106894, 82700, 82694, 106974, 82830, 82240, 106672, 118876, 82208, 106648, 118862, 82192, 106636, 82184, 106630, 82180, 82352, 82328, 82316, 82080, 118830, 106572, 106566, 82050, 117472, 124280, 127678, 103616, 117360, 124220, 103520, 117304, 124190, 75840, 103472, 75808, 104160, 117624, 124350, 76992, 104048, 117564, 76896, 103992, 76848, 76824, 77536, 104312, 117694, 77424, 104252, 77368, 77340, 77688, 104382, 77628, 77758, 121536, 126320, 128700, 121440, 126264, 128670, 111680, 121392, 126236, 111648, 121368, 126222, 111632, 121356, 103104, 117104, 124092, 112320, 103008, 117048, 124062, 112224, 121656, 126366, 93248, 74784, 102936, 117006, 93216, 112152, 93200, 75456, 103280, 117180, 93888, 75360, 103224, 117150, 93792, 112440, 121758, 93744, 75288, 93720, 75632, 103356, 94064, 75576, 103326, 94008, 112542, 93980, 75708, 94140, 75678, 94110, 121184, 126136, 128606, 111168, 121136, 126108, 111136, 121112, 126094, 111120, 121100, 111112, 111108, 102752, 116920, 123998, 111456, 102704, 116892, 91712, 74272, 121244, 116878, 91680, 74256, 102668, 91664, 111372, 102662, 74244, 74592, 102840, 116958, 92000, 74544, 102812, 91952, 111516, 102798, 91928, 74508, 74502, 74680, 102878, 92088, 74652, 92060, 74638, 92046, 92126, 110912, 121008, 126044, 110880, 120984, 126030, 110864, 120972, 110856, 120966, 110852, 110850, 74048, 102576, 116828, 90944, 74016, 102552, 116814, 90912, 111000, 121038, 90896, 73992, 102534, 90888, 110982, 90884, 74160, 102620, 91056, 74136, 102606, 91032, 111054, 91020, 74118, 91014, 91100, 91086, 110752, 120920, 125998, 110736, 120908, 110728, 120902, 110724, 110722, 73888, 102488, 116782, 90528, 73872, 102476, 90512, 110796, 102470, 90504, 73860, 90500, 73858, 73944, 90584, 90572, 90566, 120876, 120870, 110658, 102444, 73800, 90312, 90308, 90306, 101056, 116080, 123580, 100960, 116024, 70720, 100912, 115996, 70688, 100888, 70672, 70664, 71360, 101232, 116156, 71264, 101176, 116126, 71216, 101148, 71192, 71180, 71536, 101308, 71480, 101278, 71452, 71612, 71582, 118112, 124600, 127838, 105024, 118064, 124572, 104992, 118040, 124558, 104976, 118028, 104968, 118022, 100704, 115896, 123486, 105312, 100656, 115868, 79424, 70176, 118172, 115854, 79392, 105240, 100620, 79376, 70152, 79368, 70496, 100792, 115934, 79712, 70448, 118238, 79664, 105372, 100750, 79640, 70412, 79628, 70584, 100830, 79800, 70556, 79772, 70542, 70622, 79838, 122176, 126640, 128860, 122144, 126616, 128846, 122128, 126604, 122120, 126598, 122116, 104768, 117936, 124508, 113472, 104736, 126684, 124494, 113440, 122264, 126670, 113424, 104712, 117894, 113416, 122246, 104706, 69952, 100528, 115804, 78656, 69920, 100504, 115790, 96064, 78624, 104856, 117966, 96032, 113560, 122318, 100486, 96016, 78600, 104838, 96008, 69890, 70064, 100572, 78768, 70040, 100558, 96176, 78744, 104910, 96152, 113614, 70022, 78726, 70108, 78812, 70094, 96220, 78798, 122016, 126552, 128814, 122000, 126540, 121992, 126534, 121988, 121986, 104608, 117848, 124462, 113056, 104592, 126574, 113040, 122060, 117830, 113032, 104580, 113028, 104578, 113026, 69792, 100440, 115758, 78240, 69776, 100428, 95136, 78224, 104652, 100422, 95120, 113100, 69764, 95112, 78212, 69762, 78210, 69848, 100462, 78296, 69836, 95192, 78284, 69830, 95180, 78278, 69870, 95214, 121936, 126508, 121928, 126502, 121924, 121922, 104528, 117804, 112848, 104520, 117798, 112840, 121958, 112836, 104514, 112834, 69712, 100396, 78032, 69704, 100390, 94672, 78024, 104550, 94664, 112870, 69698, 94660, 78018, 94658, 78060, 94700, 94694, 126486, 121890, 117782, 104484, 104482, 69672, 77928, 94440, 69666, 77922, 99680, 68160, 99632, 68128, 99608, 115342, 68112, 99596, 68104, 99590, 68448, 99768, 115422, 68400, 99740, 68376, 99726, 68364, 68358, 68536, 99806, 68508, 68494, 68574, 101696, 116400, 123740, 101664, 116376, 101648, 116364, 101640, 116358, 101636, 67904, 99504, 115292, 72512, 67872, 116444, 115278, 72480, 101784, 116430, 72464, 67848, 99462, 72456, 101766, 67842, 68016, 99548, 72624, 67992, 99534, 72600, 101838, 72588, 67974, 68060, 72668, 68046, 72654, 118432, 124760, 127918, 118416, 124748, 118408, 124742, 118404, 118402, 101536, 116312, 105888, 101520, 116300, 105872, 118476, 116294, 105864, 101508, 105860, 101506, 105858, 67744, 99416, 72096, 67728, 116334, 80800, 72080, 101580, 99398, 80784, 105932, 67716, 80776, 72068, 67714, 72066, 67800, 99438, 72152, 67788, 80856, 72140, 67782, 80844, 72134, 67822, 72174, 80878, 126800, 128940, 126792, 128934, 126788, 126786, 118352, 124716, 122576, 126828, 124710, 122568, 126822, 122564, 118338, 122562, 101456, 116268, 105680, 101448, 116262, 114128, 105672, 118374, 114120, 122598, 101442, 114116, 105666, 114114, 67664, 99372, 71888, 67656, 99366, 80336, 71880, 101478, 97232, 80328, 105702, 67650, 97224, 114150, 71874, 97220, 67692, 71916, 67686, 80364, 71910, 97260, 80358, 97254, 126760, 128918, 126756, 126754, 118312, 124694, 122472, 126774, 122468, 118306, 122466, 101416, 116246, 105576, 101412, 113896, 105572, 101410, 113892, 105570, 113890, 67624, 99350, 71784, 101430, 80104, 71780, 67618, 96744, 80100, 71778, 96740, 80098, 96738, 71798, 96758, 126738, 122420, 122418, 105524, 113780, 113778, 71732, 79988, 96500, 96498, 66880, 66848, 98968, 66832, 66824, 66820, 66992, 66968, 66956, 66950, 67036, 67022, 100000, 99984, 115532, 99976, 115526, 99972, 99970, 66720, 98904, 69024, 100056, 98892, 69008, 100044, 69000, 100038, 68996, 66690, 68994, 66776, 98926, 69080, 100078, 69068, 66758, 69062, 66798, 69102, 116560, 116552, 116548, 116546, 99920, 102096, 116588, 115494, 102088, 116582, 102084, 99906, 102082, 66640, 68816, 66632, 98854, 73168, 68808, 66628, 73160, 68804, 66626, 73156, 68802, 66668, 68844, 66662, 73196, 68838, 73190, 124840, 124836, 124834, 116520, 118632, 124854, 118628, 116514, 118626, 99880, 115478, 101992, 116534, 106216, 101988, 99874, 106212, 101986, 106210, 66600, 98838, 68712, 99894, 72936, 68708, 66594, 81384, 72932, 68706, 81380, 72930, 66614, 68726, 72950, 81398, 128980, 128978, 124820, 126900, 124818, 126898, 116500, 118580, 116498, 122740, 118578, 122738, 99860, 101940, 99858, 106100, 101938, 114420}, new int[]{128352, 129720, 125504, 128304, 129692, 125472, 128280, 129678, 125456, 128268, 125448, 128262, 125444, 125792, 128440, 129758, 120384, 125744, 128412, 120352, 125720, 128398, 120336, 125708, 120328, 125702, 120324, 120672, 125880, 128478, 110144, 120624, 125852, 110112, 120600, 125838, 110096, 120588, 110088, 120582, 110084, 110432, 120760, 125918, 89664, 110384, 120732, 89632, 110360, 120718, 89616, 110348, 89608, 110342, 89952, 110520, 120798, 89904, 110492, 89880, 110478, 89868, 90040, 110558, 90012, 89998, 125248, 128176, 129628, 125216, 128152, 129614, 125200, 128140, 125192, 128134, 125188, 125186, 119616, 125360, 128220, 119584, 125336, 128206, 119568, 125324, 119560, 125318, 119556, 119554, 108352, 119728, 125404, 108320, 119704, 125390, 108304, 119692, 108296, 119686, 108292, 108290, 85824, 108464, 119772, 85792, 108440, 119758, 85776, 108428, 85768, 108422, 85764, 85936, 108508, 85912, 108494, 85900, 85894, 85980, 85966, 125088, 128088, 129582, 125072, 128076, 125064, 128070, 125060, 125058, 119200, 125144, 128110, 119184, 125132, 119176, 125126, 119172, 119170, 107424, 119256, 125166, 107408, 119244, 107400, 119238, 107396, 107394, 83872, 107480, 119278, 83856, 107468, 83848, 107462, 83844, 83842, 83928, 107502, 83916, 83910, 83950, 125008, 128044, 125000, 128038, 124996, 124994, 118992, 125036, 118984, 125030, 118980, 118978, 106960, 119020, 106952, 119014, 106948, 106946, 82896, 106988, 82888, 106982, 82884, 82882, 82924, 82918, 124968, 128022, 124964, 124962, 118888, 124982, 118884, 118882, 106728, 118902, 106724, 106722, 82408, 106742, 82404, 82402, 124948, 124946, 118836, 118834, 106612, 106610, 124224, 127664, 129372, 124192, 127640, 129358, 124176, 127628, 124168, 127622, 124164, 124162, 117568, 124336, 127708, 117536, 124312, 127694, 117520, 124300, 117512, 124294, 117508, 117506, 104256, 117680, 124380, 104224, 117656, 124366, 104208, 117644, 104200, 117638, 104196, 104194, 77632, 104368, 117724, 77600, 104344, 117710, 77584, 104332, 77576, 104326, 77572, 77744, 104412, 77720, 104398, 77708, 77702, 77788, 77774, 128672, 129880, 93168, 128656, 129868, 92664, 128648, 129862, 92412, 128644, 128642, 124064, 127576, 129326, 126368, 124048, 129902, 126352, 128716, 127558, 126344, 124036, 126340, 124034, 126338, 117152, 124120, 127598, 121760, 117136, 124108, 121744, 126412, 124102, 121736, 117124, 121732, 117122, 121730, 103328, 117208, 124142, 112544, 103312, 117196, 112528, 121804, 117190, 112520, 103300, 112516, 103298, 112514, 75680, 103384, 117230, 94112, 75664, 103372, 94096, 112588, 103366, 94088, 75652, 94084, 75650, 75736, 103406, 94168, 75724, 94156, 75718, 94150, 75758, 128592, 129836, 91640, 128584, 129830, 91388, 128580, 91262, 128578, 123984, 127532, 126160, 123976, 127526, 126152, 128614, 126148, 123970, 126146, 116944, 124012, 121296, 116936, 124006, 121288, 126182, 121284, 116930, 121282, 102864, 116972, 111568, 102856, 116966, 111560, 121318, 111556, 102850, 111554, 74704, 102892, 92112, 74696, 102886, 92104, 111590, 92100, 74690, 92098, 74732, 92140, 74726, 92134, 128552, 129814, 90876, 128548, 90750, 128546, 123944, 127510, 126056, 128566, 126052, 123938, 126050, 116840, 123958, 121064, 116836, 121060, 116834, 121058, 102632, 116854, 111080, 121078, 111076, 102626, 111074, 74216, 102646, 91112, 74212, 91108, 74210, 91106, 74230, 91126, 128532, 90494, 128530, 123924, 126004, 123922, 126002, 116788, 120948, 116786, 120946, 102516, 110836, 102514, 110834, 73972, 90612, 73970, 90610, 128522, 123914, 125978, 116762, 120890, 102458, 110714, 123552, 127320, 129198, 123536, 127308, 123528, 127302, 123524, 123522, 116128, 123608, 127342, 116112, 123596, 116104, 123590, 116100, 116098, 101280, 116184, 123630, 101264, 116172, 101256, 116166, 101252, 101250, 71584, 101336, 116206, 71568, 101324, 71560, 101318, 71556, 71554, 71640, 101358, 71628, 71622, 71662, 127824, 129452, 79352, 127816, 129446, 79100, 127812, 78974, 127810, 123472, 127276, 124624, 123464, 127270, 124616, 127846, 124612, 123458, 124610, 115920, 123500, 118224, 115912, 123494, 118216, 124646, 118212, 115906, 118210, 100816, 115948, 105424, 100808, 115942, 105416, 118246, 105412, 100802, 105410, 70608, 100844, 79824, 70600, 100838, 79816, 105446, 79812, 70594, 79810, 70636, 79852, 70630, 79846, 129960, 95728, 113404, 129956, 95480, 113278, 129954, 95356, 95294, 127784, 129430, 78588, 128872, 129974, 95996, 78462, 128868, 127778, 95870, 128866, 123432, 127254, 124520, 123428, 126696, 128886, 123426, 126692, 124514, 126690, 115816, 123446, 117992, 115812, 122344, 117988, 115810, 122340, 117986, 122338, 100584, 115830, 104936, 100580, 113640, 104932, 100578, 113636, 104930, 113634, 70120, 100598, 78824, 70116, 96232, 78820, 70114, 96228, 78818, 96226, 70134, 78838, 129940, 94968, 113022, 129938, 94844, 94782, 127764, 78206, 128820, 127762, 95102, 128818, 123412, 124468, 123410, 126580, 124466, 126578, 115764, 117876, 115762, 122100, 117874, 122098, 100468, 104692, 100466, 113140, 104690, 113138, 69876, 78324, 69874, 95220, 78322, 95218, 129930, 94588, 94526, 127754, 128794, 123402, 124442, 126522, 115738, 117818, 121978, 100410, 104570, 112890, 69754, 78074, 94714, 94398, 123216, 127148, 123208, 127142, 123204, 123202, 115408, 123244, 115400, 123238, 115396, 115394, 99792, 115436, 99784, 115430, 99780, 99778, 68560, 99820, 68552, 99814, 68548, 68546, 68588, 68582, 127400, 129238, 72444, 127396, 72318, 127394, 123176, 127126, 123752, 123172, 123748, 123170, 123746, 115304, 123190, 116456, 115300, 116452, 115298, 116450, 99560, 115318, 101864, 99556, 101860, 99554, 101858, 68072, 99574, 72680, 68068, 72676, 68066, 72674, 68086, 72694, 129492, 80632, 105854, 129490, 80508, 80446, 127380, 72062, 127924, 127378, 80766, 127922, 123156, 123700, 123154, 124788, 123698, 124786, 115252, 116340, 115250, 118516, 116338, 118514, 99444, 101620, 99442, 105972, 101618, 105970, 67828, 72180, 67826, 80884, 72178, 80882, 97008, 114044, 96888, 113982, 96828, 96798, 129482, 80252, 130010, 97148, 80190, 97086, 127370, 127898, 128954, 123146, 123674, 124730, 126842, 115226, 116282, 118394, 122618, 99386, 101498, 105722, 114170, 67706, 71930, 80378, 96632, 113854, 96572, 96542, 80062, 96702, 96444, 96414, 96350, 123048, 123044, 123042, 115048, 123062, 115044, 115042, 99048, 115062, 99044, 99042, 67048, 99062, 67044, 67042, 67062, 127188, 68990, 127186, 123028, 123316, 123026, 123314, 114996, 115572, 114994, 115570, 98932, 100084, 98930, 100082, 66804, 69108, 66802, 69106, 129258, 73084, 73022, 127178, 127450, 123018, 123290, 123834, 114970, 115514, 116602, 98874, 99962, 102138, 66682, 68858, 73210, 81272, 106174, 81212, 81182, 72894, 81342, 97648, 114364, 97592, 114334, 97564, 97550, 81084, 97724, 81054, 97694, 97464, 114270, 97436, 97422, 80990, 97502, 97372, 97358, 97326, 114868, 114866, 98676, 98674, 66292, 66290, 123098, 114842, 115130, 98618, 99194, 66170, 67322, 69310, 73404, 73374, 81592, 106334, 81564, 81550, 73310, 81630, 97968, 114524, 97944, 114510, 97932, 97926, 81500, 98012, 81486, 97998, 97880, 114478, 97868, 97862, 81454, 97902, 97836, 97830, 69470, 73564, 73550, 81752, 106414, 81740, 81734, 73518, 81774, 81708, 81702}, new int[]{109536, 120312, 86976, 109040, 120060, 86496, 108792, 119934, 86256, 108668, 86136, 129744, 89056, 110072, 129736, 88560, 109820, 129732, 88312, 109694, 129730, 88188, 128464, 129772, 89592, 128456, 129766, 89340, 128452, 89214, 128450, 125904, 128492, 125896, 128486, 125892, 125890, 120784, 125932, 120776, 125926, 120772, 120770, 110544, 120812, 110536, 120806, 110532, 84928, 108016, 119548, 84448, 107768, 119422, 84208, 107644, 84088, 107582, 84028, 129640, 85488, 108284, 129636, 85240, 108158, 129634, 85116, 85054, 128232, 129654, 85756, 128228, 85630, 128226, 125416, 128246, 125412, 125410, 119784, 125430, 119780, 119778, 108520, 119798, 108516, 108514, 83424, 107256, 119166, 83184, 107132, 83064, 107070, 83004, 82974, 129588, 83704, 107390, 129586, 83580, 83518, 128116, 83838, 128114, 125172, 125170, 119284, 119282, 107508, 107506, 82672, 106876, 82552, 106814, 82492, 82462, 129562, 82812, 82750, 128058, 125050, 119034, 82296, 106686, 82236, 82206, 82366, 82108, 82078, 76736, 103920, 117500, 76256, 103672, 117374, 76016, 103548, 75896, 103486, 75836, 129384, 77296, 104188, 129380, 77048, 104062, 129378, 76924, 76862, 127720, 129398, 77564, 127716, 77438, 127714, 124392, 127734, 124388, 124386, 117736, 124406, 117732, 117730, 104424, 117750, 104420, 104418, 112096, 121592, 126334, 92608, 111856, 121468, 92384, 111736, 121406, 92272, 111676, 92216, 111646, 92188, 75232, 103160, 117118, 93664, 74992, 103036, 93424, 112252, 102974, 93304, 74812, 93244, 74782, 93214, 129332, 75512, 103294, 129908, 129330, 93944, 75388, 129906, 93820, 75326, 93758, 127604, 75646, 128756, 127602, 94078, 128754, 124148, 126452, 124146, 126450, 117236, 121844, 117234, 121842, 103412, 103410, 91584, 111344, 121212, 91360, 111224, 121150, 91248, 111164, 91192, 111134, 91164, 91150, 74480, 102780, 91888, 74360, 102718, 91768, 111422, 91708, 74270, 91678, 129306, 74620, 129850, 92028, 74558, 91966, 127546, 128634, 124026, 126202, 116986, 121338, 102906, 90848, 110968, 121022, 90736, 110908, 90680, 110878, 90652, 90638, 74104, 102590, 91000, 74044, 90940, 74014, 90910, 74174, 91070, 90480, 110780, 90424, 110750, 90396, 90382, 73916, 90556, 73886, 90526, 90296, 110686, 90268, 90254, 73822, 90334, 90204, 90190, 71136, 101112, 116094, 70896, 100988, 70776, 100926, 70716, 70686, 129204, 71416, 101246, 129202, 71292, 71230, 127348, 71550, 127346, 123636, 123634, 116212, 116210, 101364, 101362, 79296, 105200, 118140, 79072, 105080, 118078, 78960, 105020, 78904, 104990, 78876, 78862, 70384, 100732, 79600, 70264, 100670, 79480, 105278, 79420, 70174, 79390, 129178, 70524, 129466, 79740, 70462, 79678, 127290, 127866, 123514, 124666, 115962, 118266, 100858, 113376, 122232, 126654, 95424, 113264, 122172, 95328, 113208, 122142, 95280, 113180, 95256, 113166, 95244, 78560, 104824, 117950, 95968, 78448, 104764, 95856, 113468, 104734, 95800, 78364, 95772, 78350, 95758, 70008, 100542, 78712, 69948, 96120, 78652, 69918, 96060, 78622, 96030, 70078, 78782, 96190, 94912, 113008, 122044, 94816, 112952, 122014, 94768, 112924, 94744, 112910, 94732, 94726, 78192, 104636, 95088, 78136, 104606, 95032, 113054, 95004, 78094, 94990, 69820, 78268, 69790, 95164, 78238, 95134, 94560, 112824, 121950, 94512, 112796, 94488, 112782, 94476, 94470, 78008, 104542, 94648, 77980, 94620, 77966, 94606, 69726, 78046, 94686, 94384, 112732, 94360, 112718, 94348, 94342, 77916, 94428, 77902, 94414, 94296, 112686, 94284, 94278, 77870, 94318, 94252, 94246, 68336, 99708, 68216, 99646, 68156, 68126, 68476, 68414, 127162, 123258, 115450, 99834, 72416, 101752, 116414, 72304, 101692, 72248, 101662, 72220, 72206, 67960, 99518, 72568, 67900, 72508, 67870, 72478, 68030, 72638, 80576, 105840, 118460, 80480, 105784, 118430, 80432, 105756, 80408, 105742, 80396, 80390, 72048, 101564, 80752, 71992, 101534, 80696, 71964, 80668, 71950, 80654, 67772, 72124, 67742, 80828, 72094, 80798, 114016, 122552, 126814, 96832, 113968, 122524, 96800, 113944, 122510, 96784, 113932, 96776, 113926, 96772, 80224, 105656, 118366, 97120, 80176, 105628, 97072, 114076, 105614, 97048, 80140, 97036, 80134, 97030, 71864, 101470, 80312, 71836, 97208, 80284, 71822, 97180, 80270, 97166, 67678, 71902, 80350, 97246, 96576, 113840, 122460, 96544, 113816, 122446, 96528, 113804, 96520, 113798, 96516, 96514, 80048, 105564, 96688, 80024, 105550, 96664, 113870, 96652, 80006, 96646, 71772, 80092, 71758, 96732, 80078, 96718, 96416, 113752, 122414, 96400, 113740, 96392, 113734, 96388, 96386, 79960, 105518, 96472, 79948, 96460, 79942, 96454, 71726, 79982, 96494, 96336, 113708, 96328, 113702, 96324, 96322, 79916, 96364, 79910, 96358, 96296, 113686, 96292, 96290, 79894, 96310, 66936, 99006, 66876, 66846, 67006, 68976, 100028, 68920, 99998, 68892, 68878, 66748, 69052, 66718, 69022, 73056, 102072, 116574, 73008, 102044, 72984, 102030, 72972, 72966, 68792, 99934, 73144, 68764, 73116, 68750, 73102, 66654, 68830, 73182, 81216, 106160, 118620, 81184, 106136, 118606, 81168, 106124, 81160, 106118, 81156, 81154, 72880, 101980, 81328, 72856, 101966, 81304, 106190, 81292, 72838, 81286, 68700, 72924, 68686, 81372, 72910, 81358, 114336, 122712, 126894, 114320, 122700, 114312, 122694, 114308, 114306, 81056, 106072, 118574, 97696, 81040, 106060, 97680, 114380, 106054, 97672, 81028, 97668, 81026, 97666, 72792, 101934, 81112, 72780, 97752, 81100, 72774, 97740, 81094, 97734, 68654, 72814, 81134, 97774, 114256, 122668, 114248, 122662, 114244, 114242, 80976, 106028, 97488, 80968, 106022, 97480, 114278, 97476, 80962, 97474, 72748, 81004, 72742, 97516, 80998, 97510, 114216, 122646, 114212, 114210, 80936, 106006, 97384, 80932, 97380, 80930, 97378, 72726, 80950, 97398, 114196, 114194, 80916, 97332, 80914, 97330, 66236, 66206, 67256, 99166, 67228, 67214, 66142, 67294, 69296, 100188, 69272, 100174, 69260, 69254, 67164, 69340, 67150, 69326, 73376, 102232, 116654, 73360, 102220, 73352, 102214, 73348, 73346, 69208, 100142, 73432, 102254, 73420, 69190, 73414, 67118, 69230, 73454, 106320, 118700, 106312, 118694, 106308, 106306, 73296, 102188, 81616, 106348, 102182, 81608, 73284, 81604, 73282, 81602, 69164, 73324, 69158, 81644, 73318, 81638, 122792, 126934, 122788, 122786, 106280, 118678, 114536, 106276, 114532, 106274, 114530, 73256, 102166, 81512, 73252, 98024, 81508, 73250, 98020, 81506, 98018, 69142, 73270, 81526, 98038, 122772, 122770, 106260, 114484, 106258, 114482, 73236, 81460, 73234, 97908, 81458, 97906, 122762, 106250, 114458, 73226, 81434, 97850, 66396, 66382, 67416, 99246, 67404, 67398, 66350, 67438, 69456, 100268, 69448, 100262, 69444, 69442, 67372, 69484, 67366, 69478, 102312, 116694, 102308, 102306, 69416, 100246, 73576, 102326, 73572, 69410, 73570, 67350, 69430, 73590, 118740, 118738, 102292, 106420, 102290, 106418, 69396, 73524, 69394, 81780, 73522, 81778, 118730, 102282, 106394, 69386, 73498, 81722, 66476, 66470, 67496, 99286, 67492, 67490, 66454, 67510, 100308, 100306, 67476, 69556, 67474, 69554, 116714}};
    public static final b D = new b();
    public static final hc.d E = new hc.d();
    public static final r F = new r("REMOVED_TASK");
    public static final r G = new r("CLOSED_EMPTY");
    public static final b H = new b();
    public static final b I = new b();
    public static final /* synthetic */ b J = new b();
    public static final String[] K = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] L = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static final b M = new b();

    public static final Uri.Builder A0(p sdkInstance) {
        String str;
        i.g(sdkInstance, "sdkInstance");
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        int i6 = sdkInstance.f20103b.f12856b;
        d.j(i6, "dataCenter");
        int d10 = h.d(i6);
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    if (d10 == 3) {
                        str = "sdk-04.moengage.com";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "sdk-03.moengage.com";
                }
            } else {
                str = "sdk-02.moengage.com";
            }
        } else {
            str = "sdk-01.moengage.com";
        }
        Uri.Builder encodedAuthority = scheme.encodedAuthority(str);
        i.f(encodedAuthority, "Builder()\n        .schem…e.initConfig.dataCenter))");
        return encodedAuthority;
    }

    public static final h0 B0(ViewGroup viewGroup) {
        i.g(viewGroup, "<this>");
        return new h0(viewGroup);
    }

    public static int C0(int i6, View view) {
        Context context = view.getContext();
        TypedValue c10 = ub.b.c(view.getContext(), view.getClass().getCanonicalName(), i6);
        int i10 = c10.resourceId;
        if (i10 != 0) {
            return g0.a.b(context, i10);
        }
        return c10.data;
    }

    public static int D0(Context context, int i6, int i10) {
        TypedValue a10 = ub.b.a(i6, context);
        if (a10 != null) {
            int i11 = a10.resourceId;
            if (i11 != 0) {
                return g0.a.b(context, i11);
            }
            return a10.data;
        }
        return i10;
    }

    public static final l E0(Context context, p sdkInstance) {
        ad.h a10;
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        l lVar = new l();
        w.f29578a.getClass();
        uh.b f = w.f(context, sdkInstance);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = lVar.f12898b;
        jSONObject.put("os", "ANDROID");
        jSONObject.put("app_id", sdkInstance.f20103b.f12855a);
        jSONObject.put("sdk_ver", String.valueOf(di.b.n()));
        jSONObject.put("unique_id", f.n());
        jSONObject.put("device_ts", String.valueOf(currentTimeMillis));
        jSONObject.put("device_tz_offset", String.valueOf(TimeZone.getDefault().getOffset(currentTimeMillis)));
        bh.a.f4292a.getClass();
        jSONObject.put("app_ver", String.valueOf(bh.a.a(context).f504a));
        if (!f.Q().f20083a) {
            jSONObject.put("app_version_name", bh.a.a(context).f505b);
            if (f.E().f20081b) {
                String L2 = f.L();
                if (n.B0(L2) && (a10 = rg.a.a(context)) != null) {
                    L2 = a10.f505b;
                }
                if (!n.B0(L2)) {
                    jSONObject.put("moe_gaid", L2);
                }
            }
        }
        jSONObject.put("moe_push_ser", f.T());
        return lVar;
    }

    public static final JSONArray F0(List integrations) {
        i.g(integrations, "integrations");
        JSONArray jSONArray = new JSONArray();
        Iterator it = integrations.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = new JSONObject();
            ((ih.l) it.next()).getClass();
            jSONObject.put("type", (Object) null).put("version", (Object) null);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static final PublicKey G0(String str) {
        byte[] decode = Base64.decode(n.F0(n.F0(n.F0(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        i.f(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        i.f(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String H0(String kid) {
        i.g(kid, "kid");
        h5.p pVar = h5.p.f17269a;
        URL url = new URL("https", i.n(h5.p.r, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        x xVar = new x();
        h5.p.c().execute(new a(url, xVar, kid, reentrantLock, newCondition, 0));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) xVar.f23469u;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static boolean I0(int i6) {
        if (i6 != 0 && j0.d.d(i6) > 0.5d) {
            return true;
        }
        return false;
    }

    public static int L0(float f, int i6, int i10) {
        return j0.d.f(j0.d.h(i10, Math.round(Color.alpha(i10) * f)), i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: UnsupportedEncodingException -> 0x006a, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x006a, blocks: (B:7:0x0022, B:21:0x0065, B:16:0x0047, B:18:0x005c, B:19:0x005f, B:10:0x0036, B:12:0x003f), top: B:28:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map N0(String str) {
        Map emptyMap;
        JSONObject jSONObject;
        v9.o.e(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            return Collections.emptyMap();
        }
        try {
            String str2 = new String(Base64.decode(split[1], 11), "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception e10) {
                    String str3 = "Failed to parse JSONObject into Map:\n" + e10;
                    if (Log.isLoggable("FirebaseAppCheck", 3)) {
                        Log.d("FirebaseAppCheck", str3, null);
                    }
                    emptyMap = Collections.emptyMap();
                }
                if (jSONObject != JSONObject.NULL) {
                    emptyMap = T0(jSONObject);
                    if (emptyMap != null) {
                        return Collections.emptyMap();
                    }
                    return emptyMap;
                }
            }
            emptyMap = null;
            if (emptyMap != null) {
            }
        } catch (UnsupportedEncodingException e11) {
            Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e11, null);
            return Collections.emptyMap();
        }
    }

    public static void O0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof f) {
            ((f) background).j(f);
        }
    }

    public static void P0(b0.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.f3905b;
        try {
            boolean z10 = true;
            switch (h.d(aVar.f3906c)) {
                case 0:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((s0((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (s0((int) (fArr[3] * 255.0f)) << 24) | (s0((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | s0((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int s02 = s0((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int s03 = s0((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((s02 << 16) | (s0((int) (fArr[3] * 255.0f)) << 24) | (s03 << 8) | s0((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + aVar.f3905b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view, objArr);
                    return;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder g5 = d.g("cannot access method ", str, " on View \"");
            g5.append(a0.a.d(view));
            g5.append("\"");
            Log.e("CustomSupport", g5.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            StringBuilder g10 = d.g("no method ", str, " on View \"");
            g10.append(a0.a.d(view));
            g10.append("\"");
            Log.e("CustomSupport", g10.toString());
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public static void Q0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof f) {
            R0(view, (f) background);
        }
    }

    public static void R0(View view, f fVar) {
        boolean z10;
        nb.a aVar = fVar.f38424u.f38432b;
        if (aVar != null && aVar.f25974a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                f += d0.i.i((View) parent);
            }
            f.b bVar = fVar.f38424u;
            if (bVar.f38442m != f) {
                bVar.f38442m = f;
                fVar.n();
            }
        }
    }

    public static ArrayList S0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            Object obj = jSONArray.get(i6);
            if (obj instanceof JSONArray) {
                obj = S0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = T0((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static t.b T0(JSONObject jSONObject) {
        t.b bVar = new t.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = S0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = T0((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    public static void U0(Object obj, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new VerifyException(kotlin.jvm.internal.h.P(str, obj));
    }

    public static final boolean V0(PublicKey publicKey, String data, String signature) {
        i.g(data, "data");
        i.g(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(gv.a.f16927b);
            i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            i.f(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object W0(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static /* synthetic */ String X0(int i6) {
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 5) {
                        if (i6 != 6) {
                            return "UNRECOGNIZED";
                        }
                        return "DHKEM_P521_HKDF_SHA512";
                    }
                    return "DHKEM_P384_HKDF_SHA384";
                }
                return "DHKEM_P256_HKDF_SHA256";
            }
            return "DHKEM_X25519_HKDF_SHA256";
        }
        return "KEM_UNKNOWN";
    }

    public static /* synthetic */ boolean Y0(String str, Object obj) {
        if (str != obj && (str == null || !str.equals(obj))) {
            return false;
        }
        return true;
    }

    public static void Z0(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static String r0(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i6 = 0; i6 < length; i6++) {
            char[] cArr = f14866u;
            sb2.append(cArr[(bArr[i6] & 240) >>> 4]);
            sb2.append(cArr[bArr[i6] & 15]);
        }
        return sb2.toString();
    }

    public static int s0(int i6) {
        int i10 = (i6 & (~(i6 >> 31))) - 255;
        return (i10 & (i10 >> 31)) + 255;
    }

    public static df.b t0(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return new yb.h();
            }
            return new yb.d();
        }
        return new yb.h();
    }

    public static void u0(int i6, int i10, i5.n nVar) {
        int i11;
        int i12;
        int i13 = 1 << (i10 - 1);
        if ((i6 & i13) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            if ((i6 & i13) != 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (i11 == i12) {
                i14++;
            } else {
                for (int i16 = 0; i16 < i14; i16++) {
                    int i17 = nVar.f19876u;
                    nVar.f19876u = i17 + 1;
                    ((byte[]) nVar.f19877v)[i17] = (byte) i11;
                }
                nVar.getClass();
                i11 = i12;
                i14 = 1;
            }
            i13 >>= 1;
        }
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = nVar.f19876u;
            nVar.f19876u = i19 + 1;
            ((byte[]) nVar.f19877v)[i19] = (byte) i11;
        }
        nVar.getClass();
    }

    public static boolean v0(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int w0(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        int i6 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        if (i6 > 0) {
            return 1;
        }
        if (i6 == 0) {
            return 0;
        }
        if (!Double.isNaN(d11)) {
            return -1;
        }
        if (!Double.isNaN(d10)) {
            return 1;
        }
        return 0;
    }

    public static ApiException x0(Status status) {
        boolean z10;
        if (status.f7300x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }

    public static final jg.d y0(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        String str = sdkInstance.f20103b.f12855a;
        l E0 = E0(context, sdkInstance);
        w.f29578a.getClass();
        return new jg.d(str, E0, w.f(context, sdkInstance).n());
    }

    public static final xh.b z0(Uri uri, int i6, p sdkInstance) {
        d.j(i6, "requestType");
        i.g(sdkInstance, "sdkInstance");
        dh.a aVar = sdkInstance.f20103b;
        if (!n.B0(aVar.f12855a)) {
            xh.b bVar = new xh.b(uri, i6);
            bVar.f37775b.put("MOE-APPKEY", aVar.f12855a);
            return bVar;
        }
        throw new SdkNotInitializedException("App ID has not been set");
    }

    @Override // zu.n
    public boolean A(k kVar) {
        return a.C0645a.U(kVar);
    }

    @Override // zu.n
    public boolean B(zu.i iVar) {
        return a.C0645a.L(iVar);
    }

    @Override // zu.n
    public xu.i C(zu.d dVar) {
        return a.C0645a.k0(dVar);
    }

    @Override // zu.n
    public boolean D(zu.i iVar) {
        return a.C0645a.P(iVar);
    }

    @Override // zu.n
    public k E(zu.i receiver, int i6) {
        boolean z10;
        i.g(receiver, "$receiver");
        if (i6 >= 0 && i6 < I(receiver)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return T(receiver, i6);
        }
        return null;
    }

    @Override // zu.n
    public zu.l F(zu.h hVar) {
        return a.C0645a.l0(this, hVar);
    }

    @Override // zu.n
    public boolean G(zu.l lVar, zu.l lVar2) {
        return a.C0645a.a(lVar, lVar2);
    }

    @Override // zu.n
    public i0 H(zu.i iVar) {
        return a.C0645a.k(iVar);
    }

    @Override // zu.n
    public int I(zu.h hVar) {
        return a.C0645a.b(hVar);
    }

    @Override // zu.n
    public boolean J(zu.d receiver) {
        i.g(receiver, "$receiver");
        return receiver instanceof ju.a;
    }

    public boolean J0(zu.h receiver) {
        i.g(receiver, "$receiver");
        if ((receiver instanceof zu.i) && D((zu.i) receiver)) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public j K(zu.i iVar) {
        return a.C0645a.c(iVar);
    }

    public boolean K0(zu.h hVar) {
        return a.C0645a.R(hVar);
    }

    @Override // zu.n
    public d1 L(c cVar) {
        return a.C0645a.f0(cVar);
    }

    @Override // zu.n
    public boolean M(zu.i receiver) {
        i.g(receiver, "$receiver");
        return r(b(receiver));
    }

    public zu.h M0(zu.h receiver) {
        i0 f;
        i.g(receiver, "$receiver");
        i0 e10 = e(receiver);
        if (e10 != null && (f = f(e10, true)) != null) {
            return f;
        }
        return receiver;
    }

    @Override // zu.n
    public int N(m mVar) {
        return a.C0645a.C(mVar);
    }

    @Override // bg.d
    public dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        d rVar;
        switch (aVar.ordinal()) {
            case 0:
                rVar = new tr.r();
                break;
            case 1:
                rVar = new gg.b();
                break;
            case 2:
                rVar = new gg.f(0);
                break;
            case 3:
                rVar = new gg.f(1);
                break;
            case 4:
                rVar = new gg.d();
                break;
            case 5:
                rVar = new df.b(18);
                break;
            case 6:
                rVar = new gg.i(1);
                break;
            case 7:
                rVar = new gg.i(0);
                break;
            case 8:
                rVar = new gg.j();
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
            case 10:
                rVar = new df.b(20);
                break;
            case 11:
                rVar = new e0(9);
                break;
            case 14:
                rVar = new gd.d(7);
                break;
            case 15:
                rVar = new gg.i(2);
                break;
        }
        return rVar.O(str, aVar, i6, i10, map);
    }

    @Override // zu.n
    public boolean P(zu.d dVar) {
        return a.C0645a.T(dVar);
    }

    @Override // zu.n
    public int Q(zu.l lVar) {
        return a.C0645a.d0(lVar);
    }

    @Override // zu.n
    public boolean R(zu.h receiver) {
        i.g(receiver, "$receiver");
        if (D(o0(receiver)) != D(q(receiver))) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public m1 S(ArrayList arrayList) {
        return v.B(arrayList);
    }

    @Override // zu.n
    public k T(zu.h hVar, int i6) {
        return a.C0645a.o(hVar, i6);
    }

    @Override // zu.n
    public boolean U(zu.h hVar) {
        return a.C0645a.J(this, hVar);
    }

    @Override // zu.n
    public Collection V(zu.l lVar) {
        return a.C0645a.i0(lVar);
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        return Float.valueOf(k3.l.d(cVar) * f);
    }

    @Override // zu.n
    public boolean X(zu.i iVar) {
        return a.C0645a.W(iVar);
    }

    @Override // zu.n
    public boolean Y(m mVar, zu.l lVar) {
        return a.C0645a.E(mVar, lVar);
    }

    @Override // zu.n
    public f1 Z(zu.h hVar) {
        return a.C0645a.j(hVar);
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().r());
    }

    @Override // zu.n
    public boolean a0(zu.l lVar) {
        return a.C0645a.G(lVar);
    }

    @Override // a7.e
    public Object apply(Object obj) {
        r0 r0Var = (r0) obj;
        try {
            int m10 = r0Var.m();
            byte[] bArr = new byte[m10];
            Logger logger = q2.f7626u0;
            p2 p2Var = new p2(bArr, m10);
            o4 a10 = l4.f7583c.a(r0.class);
            r2 r2Var = p2Var.f7628t0;
            if (r2Var == null) {
                r2Var = new r2(p2Var);
            }
            a10.e(r0Var, r2Var);
            if (m10 - p2Var.f7619y0 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = r0Var.getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    @Override // xu.a, zu.n
    public x0 b(zu.i iVar) {
        return a.C0645a.j0(iVar);
    }

    @Override // zu.n
    public v0 b0(zu.p pVar) {
        return a.C0645a.x(pVar);
    }

    @Override // xu.a, zu.n
    public i0 c(zu.f fVar) {
        return a.C0645a.Y(fVar);
    }

    @Override // zu.n
    public boolean c0(zu.l lVar) {
        return a.C0645a.O(lVar);
    }

    @Override // xu.a, zu.n
    public i0 d(zu.f fVar) {
        return a.C0645a.m0(fVar);
    }

    @Override // zu.n
    public boolean d0(zu.i receiver) {
        i.g(receiver, "$receiver");
        return e0(b(receiver));
    }

    @Override // xu.a, zu.n
    public i0 e(zu.h hVar) {
        return a.C0645a.i(hVar);
    }

    @Override // zu.n
    public boolean e0(zu.l lVar) {
        return a.C0645a.N(lVar);
    }

    @Override // xu.a, zu.n
    public i0 f(zu.i iVar, boolean z10) {
        return a.C0645a.o0(iVar, z10);
    }

    @Override // zu.n
    public Set f0(zu.i iVar) {
        return a.C0645a.e0(this, iVar);
    }

    @Override // xu.a, zu.n
    public zu.d g(zu.i iVar) {
        return a.C0645a.d(this, iVar);
    }

    @Override // zu.n
    public boolean g0(zu.l lVar) {
        return a.C0645a.Q(lVar);
    }

    @Override // zu.n
    public zu.b h(zu.d dVar) {
        return a.C0645a.l(dVar);
    }

    @Override // zu.n
    public boolean h0(zu.i iVar) {
        return a.C0645a.V(iVar);
    }

    @Override // c4.o
    public void i(g gVar, List list) {
        i.g(gVar, "<anonymous parameter 0>");
        LogHelper.INSTANCE.d(PaymentUtils.INSTANCE.getTAG(), "purchase updated");
    }

    @Override // zu.n
    public xu.b i0(zu.i iVar) {
        return a.C0645a.h0(this, iVar);
    }

    @Override // zu.n
    public m1 j(zu.d dVar) {
        return a.C0645a.a0(dVar);
    }

    @Override // zu.n
    public int j0(j jVar) {
        return a.C0645a.g0(this, jVar);
    }

    @Override // zu.n
    public i0 k(zu.e eVar) {
        return a.C0645a.c0(eVar);
    }

    @Override // zu.n
    public boolean k0(zu.l lVar) {
        return a.C0645a.I(lVar);
    }

    @Override // zu.n
    public boolean l(zu.h receiver) {
        i.g(receiver, "$receiver");
        return receiver instanceof xt.i;
    }

    @Override // zu.n
    public boolean l0(zu.h receiver) {
        i.g(receiver, "$receiver");
        if (g0(F(receiver)) && !K0(receiver)) {
            return true;
        }
        return false;
    }

    @Override // dv.b.InterfaceC0206b
    public Iterable m(Object obj) {
        return ((gt.b) obj).b().f();
    }

    @Override // xu.a
    public m1 m0(zu.i iVar, zu.i iVar2) {
        return a.C0645a.m(this, iVar, iVar2);
    }

    @Override // zu.n
    public k n(j jVar, int i6) {
        return a.C0645a.n(this, jVar, i6);
    }

    @Override // zu.n
    public m n0(zu.l lVar, int i6) {
        return a.C0645a.r(lVar, i6);
    }

    @Override // zu.n
    public m1 o(zu.h hVar) {
        return a.C0645a.b0(hVar);
    }

    @Override // zu.n
    public zu.i o0(zu.h hVar) {
        return a.C0645a.Z(this, hVar);
    }

    @Override // zu.n
    public boolean p(zu.i receiver) {
        zu.d dVar;
        i.g(receiver, "$receiver");
        i0 e10 = e(receiver);
        if (e10 != null) {
            dVar = g(e10);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public boolean p0(zu.h receiver) {
        t tVar;
        i.g(receiver, "$receiver");
        wu.v y10 = y(receiver);
        if (y10 != null) {
            tVar = q0(y10);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public zu.i q(zu.h hVar) {
        return a.C0645a.n0(this, hVar);
    }

    public t q0(zu.f fVar) {
        return a.C0645a.f(fVar);
    }

    @Override // zu.n
    public boolean r(zu.l lVar) {
        return a.C0645a.H(lVar);
    }

    @Override // zu.n
    public int s(k kVar) {
        return a.C0645a.B(kVar);
    }

    @Override // zu.o
    public boolean t(zu.i iVar, zu.i iVar2) {
        return a.C0645a.F(iVar, iVar2);
    }

    @Override // ya.b
    public /* bridge */ /* synthetic */ Object then(ya.h hVar) {
        return null;
    }

    @Override // zu.n
    public wu.o v(zu.i iVar) {
        return a.C0645a.e(iVar);
    }

    @Override // zu.n
    public m1 w(k kVar) {
        return a.C0645a.w(kVar);
    }

    @Override // zu.n
    public zu.h x(zu.h hVar) {
        return a.C0645a.p0(this, hVar);
    }

    @Override // zu.n
    public wu.v y(zu.h hVar) {
        return a.C0645a.g(hVar);
    }

    @Override // zu.n
    public boolean z(zu.l lVar) {
        return a.C0645a.K(lVar);
    }

    @Override // zu.n
    public void u(zu.i iVar, zu.l lVar) {
    }
}
