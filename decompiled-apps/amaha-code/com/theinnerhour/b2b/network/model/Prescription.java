package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: ProviderPrescriptionList.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jo\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00062"}, d2 = {"Lcom/theinnerhour/b2b/network/model/Prescription;", "Ljava/io/Serializable;", "createdAt", "", "file", "globalPrescriptionId", "id", "prescriptionDate", "status", "updatedAt", SessionManager.KEY_USERID, "userPrescriptionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getFile", "setFile", "getGlobalPrescriptionId", "setGlobalPrescriptionId", "getId", "setId", "getPrescriptionDate", "setPrescriptionDate", "getStatus", "setStatus", "getUpdatedAt", "setUpdatedAt", "getUserId", "setUserId", "getUserPrescriptionId", "setUserPrescriptionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Prescription implements Serializable {
    @b("created_at")
    private String createdAt;
    @b("file")
    private String file;
    @b("global_prescription_id")
    private String globalPrescriptionId;
    @b("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f11774id;
    @b("prescription_date")
    private String prescriptionDate;
    @b("status")
    private String status;
    @b("updated_at")
    private String updatedAt;
    @b("user_id")
    private String userId;
    @b("user_prescription_id")
    private String userPrescriptionId;

    public Prescription(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        e.u(str4, "id", str5, "prescriptionDate", str9, "userPrescriptionId");
        this.createdAt = str;
        this.file = str2;
        this.globalPrescriptionId = str3;
        this.f11774id = str4;
        this.prescriptionDate = str5;
        this.status = str6;
        this.updatedAt = str7;
        this.userId = str8;
        this.userPrescriptionId = str9;
    }

    public static /* synthetic */ Prescription copy$default(Prescription prescription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i6, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        if ((i6 & 1) != 0) {
            str10 = prescription.createdAt;
        } else {
            str10 = str;
        }
        if ((i6 & 2) != 0) {
            str11 = prescription.file;
        } else {
            str11 = str2;
        }
        if ((i6 & 4) != 0) {
            str12 = prescription.globalPrescriptionId;
        } else {
            str12 = str3;
        }
        if ((i6 & 8) != 0) {
            str13 = prescription.f11774id;
        } else {
            str13 = str4;
        }
        if ((i6 & 16) != 0) {
            str14 = prescription.prescriptionDate;
        } else {
            str14 = str5;
        }
        if ((i6 & 32) != 0) {
            str15 = prescription.status;
        } else {
            str15 = str6;
        }
        if ((i6 & 64) != 0) {
            str16 = prescription.updatedAt;
        } else {
            str16 = str7;
        }
        if ((i6 & 128) != 0) {
            str17 = prescription.userId;
        } else {
            str17 = str8;
        }
        if ((i6 & 256) != 0) {
            str18 = prescription.userPrescriptionId;
        } else {
            str18 = str9;
        }
        return prescription.copy(str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public final String component1() {
        return this.createdAt;
    }

    public final String component2() {
        return this.file;
    }

    public final String component3() {
        return this.globalPrescriptionId;
    }

    public final String component4() {
        return this.f11774id;
    }

    public final String component5() {
        return this.prescriptionDate;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.updatedAt;
    }

    public final String component8() {
        return this.userId;
    }

    public final String component9() {
        return this.userPrescriptionId;
    }

    public final Prescription copy(String str, String str2, String str3, String id2, String prescriptionDate, String str4, String str5, String str6, String userPrescriptionId) {
        i.g(id2, "id");
        i.g(prescriptionDate, "prescriptionDate");
        i.g(userPrescriptionId, "userPrescriptionId");
        return new Prescription(str, str2, str3, id2, prescriptionDate, str4, str5, str6, userPrescriptionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prescription)) {
            return false;
        }
        Prescription prescription = (Prescription) obj;
        if (i.b(this.createdAt, prescription.createdAt) && i.b(this.file, prescription.file) && i.b(this.globalPrescriptionId, prescription.globalPrescriptionId) && i.b(this.f11774id, prescription.f11774id) && i.b(this.prescriptionDate, prescription.prescriptionDate) && i.b(this.status, prescription.status) && i.b(this.updatedAt, prescription.updatedAt) && i.b(this.userId, prescription.userId) && i.b(this.userPrescriptionId, prescription.userPrescriptionId)) {
            return true;
        }
        return false;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getGlobalPrescriptionId() {
        return this.globalPrescriptionId;
    }

    public final String getId() {
        return this.f11774id;
    }

    public final String getPrescriptionDate() {
        return this.prescriptionDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPrescriptionId() {
        return this.userPrescriptionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.createdAt;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.file;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.globalPrescriptionId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int c10 = a.c(this.prescriptionDate, a.c(this.f11774id, (i11 + hashCode3) * 31, 31), 31);
        String str4 = this.status;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (c10 + hashCode4) * 31;
        String str5 = this.updatedAt;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.userId;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return this.userPrescriptionId.hashCode() + ((i13 + i6) * 31);
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setGlobalPrescriptionId(String str) {
        this.globalPrescriptionId = str;
    }

    public final void setId(String str) {
        i.g(str, "<set-?>");
        this.f11774id = str;
    }

    public final void setPrescriptionDate(String str) {
        i.g(str, "<set-?>");
        this.prescriptionDate = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserPrescriptionId(String str) {
        i.g(str, "<set-?>");
        this.userPrescriptionId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Prescription(createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", file=");
        sb2.append(this.file);
        sb2.append(", globalPrescriptionId=");
        sb2.append(this.globalPrescriptionId);
        sb2.append(", id=");
        sb2.append(this.f11774id);
        sb2.append(", prescriptionDate=");
        sb2.append(this.prescriptionDate);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", updatedAt=");
        sb2.append(this.updatedAt);
        sb2.append(", userId=");
        sb2.append(this.userId);
        sb2.append(", userPrescriptionId=");
        return g.c(sb2, this.userPrescriptionId, ')');
    }
}
