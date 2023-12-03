package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: TelecommunicationsHomeworkNotificationResponseModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTool;", "", "id", "", SessionManager.KEY_NAME, "", "toolTemplate", "Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getToolTemplate", "()Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;)Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTool;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TelecommunicationHomeworkNotificationTool {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final Integer f11778id;
    @b(SessionManager.KEY_NAME)
    private final String name;
    @b("tool_template")
    private final TelecommunicationHomeworkNotificationTemplateType toolTemplate;

    public TelecommunicationHomeworkNotificationTool(Integer num, String str, TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType) {
        this.f11778id = num;
        this.name = str;
        this.toolTemplate = telecommunicationHomeworkNotificationTemplateType;
    }

    public static /* synthetic */ TelecommunicationHomeworkNotificationTool copy$default(TelecommunicationHomeworkNotificationTool telecommunicationHomeworkNotificationTool, Integer num, String str, TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = telecommunicationHomeworkNotificationTool.f11778id;
        }
        if ((i6 & 2) != 0) {
            str = telecommunicationHomeworkNotificationTool.name;
        }
        if ((i6 & 4) != 0) {
            telecommunicationHomeworkNotificationTemplateType = telecommunicationHomeworkNotificationTool.toolTemplate;
        }
        return telecommunicationHomeworkNotificationTool.copy(num, str, telecommunicationHomeworkNotificationTemplateType);
    }

    public final Integer component1() {
        return this.f11778id;
    }

    public final String component2() {
        return this.name;
    }

    public final TelecommunicationHomeworkNotificationTemplateType component3() {
        return this.toolTemplate;
    }

    public final TelecommunicationHomeworkNotificationTool copy(Integer num, String str, TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType) {
        return new TelecommunicationHomeworkNotificationTool(num, str, telecommunicationHomeworkNotificationTemplateType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelecommunicationHomeworkNotificationTool)) {
            return false;
        }
        TelecommunicationHomeworkNotificationTool telecommunicationHomeworkNotificationTool = (TelecommunicationHomeworkNotificationTool) obj;
        if (i.b(this.f11778id, telecommunicationHomeworkNotificationTool.f11778id) && i.b(this.name, telecommunicationHomeworkNotificationTool.name) && i.b(this.toolTemplate, telecommunicationHomeworkNotificationTool.toolTemplate)) {
            return true;
        }
        return false;
    }

    public final Integer getId() {
        return this.f11778id;
    }

    public final String getName() {
        return this.name;
    }

    public final TelecommunicationHomeworkNotificationTemplateType getToolTemplate() {
        return this.toolTemplate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f11778id;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.name;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType = this.toolTemplate;
        if (telecommunicationHomeworkNotificationTemplateType != null) {
            i6 = telecommunicationHomeworkNotificationTemplateType.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        return "TelecommunicationHomeworkNotificationTool(id=" + this.f11778id + ", name=" + this.name + ", toolTemplate=" + this.toolTemplate + ')';
    }
}
