package tl;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotificationTemplateType;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* compiled from: ExpertCareDashboardFragment.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<vl.f, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f33250u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar) {
        super(1);
        this.f33250u = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(vl.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        boolean z15;
        String str3;
        boolean z16;
        String str4;
        boolean z17;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        vl.f item = fVar;
        kotlin.jvm.internal.i.g(item, "item");
        d dVar = this.f33250u;
        int i6 = item.f35270a;
        if (i6 == 2) {
            is.q.U1(dVar.f33236w, f.f33246u);
            ApplicationPersistence.getInstance().setBooleanValue("expert_bse_tip_therapy", true);
        } else if (i6 == 4) {
            is.q.U1(dVar.f33236w, g.f33247u);
            ApplicationPersistence.getInstance().setBooleanValue("expert_bse_tip_psychiatry", true);
        } else if (i6 == 3) {
            is.q.U1(dVar.f33236w, h.f33248u);
            ApplicationPersistence.getInstance().setBooleanValue("expert_bse_prep_therapy", true);
        } else if (i6 == 5) {
            is.q.U1(dVar.f33236w, i.f33249u);
            ApplicationPersistence.getInstance().setBooleanValue("expert_bse_prep_psychiatry", true);
        }
        if (i6 == 2 || i6 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || i6 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || i6 == 5) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (Utils.INSTANCE.checkConnectivity(dVar.requireActivity())) {
                if (i6 != 2 && i6 != 3) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                androidx.activity.result.c<Intent> cVar = dVar.O;
                if (i6 != 2 && i6 != 4) {
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    if (z17) {
                        str8 = "therapy";
                    } else {
                        str8 = "psychiatry";
                    }
                    applicationPersistence.setBooleanValue(Constants.TC_NOTIFICATION_PREPARATION_THINGS.concat(str8), true);
                    Intent intent = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                    intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.BSE_PREP);
                    intent.putExtra("isTherapy", z17);
                    if (z17) {
                        str9 = "therapist";
                    } else {
                        str9 = "psychiatrist";
                    }
                    intent.putExtra("providerType", str9);
                    intent.putExtra("override_source_value", dVar.U());
                    cVar.a(intent);
                    String str11 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("source", dVar.U());
                    bundle.putBoolean("custom_journal", false);
                    if (z17) {
                        str10 = "therapy";
                    } else {
                        str10 = "psychiatry";
                    }
                    bundle.putString("flow", str10);
                    bundle.putString("tool_title", dVar.getString(R.string.expert_care_first_session_prepare_body));
                    bundle.putString("tool_type", "first_session");
                    bundle.putBoolean("first_time", true);
                    hs.f Y = d.Y(dVar, null, dVar.F, 1);
                    hs.f fVar2 = (hs.f) Y.f19464u;
                    bundle.putString((String) fVar2.f19464u, (String) fVar2.f19465v);
                    hs.f fVar3 = (hs.f) Y.f19465v;
                    bundle.putString((String) fVar3.f19464u, (String) fVar3.f19465v);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "therapy_psychiatry_bse_start");
                } else {
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    if (z17) {
                        str5 = "therapy";
                    } else {
                        str5 = "psychiatry";
                    }
                    applicationPersistence2.setBooleanValue(Constants.TC_NOTIFICATION_SESSION_TIPS.concat(str5), true);
                    Intent intent2 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                    intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.BSE_TIPS);
                    intent2.putExtra("isTherapy", z17);
                    if (z17) {
                        str6 = "therapist";
                    } else {
                        str6 = "psychiatrist";
                    }
                    intent2.putExtra("providerType", str6);
                    intent2.putExtra("override_source_value", dVar.U());
                    cVar.a(intent2);
                    String str12 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", dVar.U());
                    bundle2.putBoolean("custom_journal", false);
                    if (z17) {
                        str7 = "therapy";
                    } else {
                        str7 = "psychiatry";
                    }
                    bundle2.putString("flow", str7);
                    bundle2.putString("tool_title", dVar.getString(R.string.expert_care_first_session_tips_body));
                    bundle2.putString("tool_type", "first_session");
                    bundle2.putBoolean("first_time", true);
                    hs.f Y2 = d.Y(dVar, null, dVar.F, 1);
                    hs.f fVar4 = (hs.f) Y2.f19464u;
                    bundle2.putString((String) fVar4.f19464u, (String) fVar4.f19465v);
                    hs.f fVar5 = (hs.f) Y2.f19465v;
                    bundle2.putString((String) fVar5.f19464u, (String) fVar5.f19465v);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "therapy_psychiatry_bse_start");
                }
            }
        } else {
            if (i6 == 0 || i6 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (i6 == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                ApplicationPersistence applicationPersistence3 = ApplicationPersistence.getInstance();
                if (z16) {
                    str4 = "therapy";
                } else {
                    str4 = "psychiatry";
                }
                applicationPersistence3.setBooleanValue("ia_idb_".concat(str4), true);
                androidx.activity.result.c<Intent> cVar2 = dVar.N;
                Intent intent3 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                intent3.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.INITIAL_ASSESSMENT);
                intent3.putExtra("isTherapy", z16);
                intent3.putExtra("override_source_value", dVar.U());
                cVar2.a(intent3);
                String str13 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                bundle3.putString("source", dVar.U());
                bundle3.putString("flow", d.X(dVar, null, dVar.F, 1));
                bundle3.putString("state", "pending");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, " initial_assessment_click");
            } else if (i6 == 6) {
                TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel = item.f35272c;
                if (homeworkModel != null && homeworkModel.isBSETool()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    androidx.activity.result.c<Intent> cVar3 = dVar.N;
                    Intent intent4 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                    intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FYD_BSE_ASSIGNED_ASSESSMENT);
                    String id2 = homeworkModel.getId();
                    if (id2 != null) {
                        num3 = Integer.valueOf(Integer.parseInt(id2));
                    } else {
                        num3 = null;
                    }
                    intent4.putExtra("id", num3);
                    intent4.putExtra("override_source_value", dVar.U());
                    cVar3.a(intent4);
                    String str14 = gk.a.f16573a;
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("source", dVar.U());
                    TelecommunicationHomeworkNotificationTemplateType toolTemplate = homeworkModel.getToolTemplate();
                    if (toolTemplate != null) {
                        str2 = toolTemplate.getTemplateType();
                    } else {
                        str2 = null;
                    }
                    bundle4.putString("condition", str2);
                    Boolean isCustomJournal = homeworkModel.isCustomJournal();
                    if (isCustomJournal != null) {
                        z15 = isCustomJournal.booleanValue();
                    } else {
                        z15 = false;
                    }
                    bundle4.putBoolean("custom_journal", z15);
                    bundle4.putString("flow", d.X(dVar, null, dVar.F, 1));
                    bundle4.putString("tool_title", homeworkModel.getName());
                    TelecommunicationsHomeworkResponseModel.ToolContent toolContent = homeworkModel.getToolContent();
                    if (toolContent != null) {
                        str3 = toolContent.getName();
                    } else {
                        str3 = null;
                    }
                    bundle4.putString("tool_type", str3);
                    bundle4.putBoolean("first_time", true);
                    hs.f Y3 = d.Y(dVar, null, dVar.F, 1);
                    hs.f fVar6 = (hs.f) Y3.f19464u;
                    bundle4.putString((String) fVar6.f19464u, (String) fVar6.f19465v);
                    hs.f fVar7 = (hs.f) Y3.f19465v;
                    bundle4.putString((String) fVar7.f19464u, (String) fVar7.f19465v);
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(bundle4, "therapy_psychiatry_bse_start");
                } else if (homeworkModel != null) {
                    if (item.f35271b) {
                        str = dVar.A;
                    } else {
                        str = dVar.B;
                    }
                    String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                    kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…e(SessionManager.KEY_UID)");
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    kotlin.jvm.internal.i.f(UTF_8, "UTF_8");
                    byte[] bytes = stringValue.getBytes(UTF_8);
                    kotlin.jvm.internal.i.f(bytes, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(bytes, 0);
                    androidx.activity.result.c<Intent> cVar4 = dVar.N;
                    Intent intent5 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                    intent5.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FYD_ASSIGNED_ASSESSMENT);
                    intent5.putExtra("slug", homeworkModel.getSlug());
                    String id3 = homeworkModel.getId();
                    if (id3 != null) {
                        num = Integer.valueOf(Integer.parseInt(id3));
                    } else {
                        num = null;
                    }
                    intent5.putExtra("id", num);
                    String assignedId = homeworkModel.getAssignedId();
                    if (assignedId != null) {
                        num2 = Integer.valueOf(Integer.parseInt(assignedId));
                    } else {
                        num2 = null;
                    }
                    intent5.putExtra("assessmentId", num2);
                    intent5.putExtra("providerUUID", str);
                    intent5.putExtra("emailBase64", encodeToString);
                    intent5.putExtra("userID", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                    intent5.putExtra("override_source_value", dVar.U());
                    cVar4.a(intent5);
                    String str15 = gk.a.f16573a;
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("source", dVar.U());
                    bundle5.putString("state", "pending");
                    bundle5.putString("flow", d.X(dVar, null, dVar.F, 1));
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(bundle5, "assigned_assessment_click");
                }
            }
        }
        return hs.k.f19476a;
    }
}
