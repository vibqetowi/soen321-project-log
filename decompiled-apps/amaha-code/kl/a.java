package kl;

import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotificationTool;
import java.io.Serializable;
/* compiled from: IntegratedDashboardNotificationModel.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final String f23383u;

    /* renamed from: v  reason: collision with root package name */
    public final Integer f23384v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f23385w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f23386x;

    public a(TelecommunicationHomeworkNotification telecommunicationHomeworkNotification, boolean z10) {
        Integer num;
        boolean z11;
        String id2 = telecommunicationHomeworkNotification.getId();
        if (telecommunicationHomeworkNotification.getToolType() == null && telecommunicationHomeworkNotification.getAssignedAssessment() != null) {
            num = telecommunicationHomeworkNotification.getAssignedAssessment().getId();
        } else {
            TelecommunicationHomeworkNotificationTool assignedTool = telecommunicationHomeworkNotification.getAssignedTool();
            if (assignedTool != null) {
                num = assignedTool.getId();
            } else {
                num = null;
            }
        }
        if (telecommunicationHomeworkNotification.getToolType() == null && telecommunicationHomeworkNotification.getAssignedAssessment() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23383u = id2;
        this.f23384v = num;
        this.f23385w = z10;
        this.f23386x = z11;
    }

    public final String a() {
        return this.f23383u;
    }

    public final Integer b() {
        return this.f23384v;
    }

    public final boolean c() {
        return this.f23385w;
    }

    public final boolean d() {
        return this.f23386x;
    }
}
