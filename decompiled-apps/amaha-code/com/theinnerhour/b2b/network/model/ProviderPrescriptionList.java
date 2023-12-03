package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: ProviderPrescriptionList.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ProviderPrescriptionList;", "Ljava/io/Serializable;", "prescriptionList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/Prescription;", "Lkotlin/collections/ArrayList;", "message", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPrescriptionList", "()Ljava/util/ArrayList;", "setPrescriptionList", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderPrescriptionList implements Serializable {
    @b("message")
    private String message;
    @b("data")
    private ArrayList<Prescription> prescriptionList;

    public ProviderPrescriptionList(ArrayList<Prescription> prescriptionList, String str) {
        i.g(prescriptionList, "prescriptionList");
        this.prescriptionList = prescriptionList;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProviderPrescriptionList copy$default(ProviderPrescriptionList providerPrescriptionList, ArrayList arrayList, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = providerPrescriptionList.prescriptionList;
        }
        if ((i6 & 2) != 0) {
            str = providerPrescriptionList.message;
        }
        return providerPrescriptionList.copy(arrayList, str);
    }

    public final ArrayList<Prescription> component1() {
        return this.prescriptionList;
    }

    public final String component2() {
        return this.message;
    }

    public final ProviderPrescriptionList copy(ArrayList<Prescription> prescriptionList, String str) {
        i.g(prescriptionList, "prescriptionList");
        return new ProviderPrescriptionList(prescriptionList, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderPrescriptionList)) {
            return false;
        }
        ProviderPrescriptionList providerPrescriptionList = (ProviderPrescriptionList) obj;
        if (i.b(this.prescriptionList, providerPrescriptionList.prescriptionList) && i.b(this.message, providerPrescriptionList.message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<Prescription> getPrescriptionList() {
        return this.prescriptionList;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.prescriptionList.hashCode() * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPrescriptionList(ArrayList<Prescription> arrayList) {
        i.g(arrayList, "<set-?>");
        this.prescriptionList = arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderPrescriptionList(prescriptionList=");
        sb2.append(this.prescriptionList);
        sb2.append(", message=");
        return g.c(sb2, this.message, ')');
    }
}
