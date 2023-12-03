package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalThoughtModel;", "", "situation", "Lcom/theinnerhour/b2b/components/journal/model/Situation;", "acknowledge", "Lcom/theinnerhour/b2b/components/journal/model/Acknowledge;", "describe", "Lcom/theinnerhour/b2b/components/journal/model/Describe;", "identifyThinkingStyle", "Lcom/theinnerhour/b2b/components/journal/model/IdentifyThinkingStyle;", "(Lcom/theinnerhour/b2b/components/journal/model/Situation;Lcom/theinnerhour/b2b/components/journal/model/Acknowledge;Lcom/theinnerhour/b2b/components/journal/model/Describe;Lcom/theinnerhour/b2b/components/journal/model/IdentifyThinkingStyle;)V", "getAcknowledge", "()Lcom/theinnerhour/b2b/components/journal/model/Acknowledge;", "setAcknowledge", "(Lcom/theinnerhour/b2b/components/journal/model/Acknowledge;)V", "getDescribe", "()Lcom/theinnerhour/b2b/components/journal/model/Describe;", "setDescribe", "(Lcom/theinnerhour/b2b/components/journal/model/Describe;)V", "getIdentifyThinkingStyle", "()Lcom/theinnerhour/b2b/components/journal/model/IdentifyThinkingStyle;", "setIdentifyThinkingStyle", "(Lcom/theinnerhour/b2b/components/journal/model/IdentifyThinkingStyle;)V", "getSituation", "()Lcom/theinnerhour/b2b/components/journal/model/Situation;", "setSituation", "(Lcom/theinnerhour/b2b/components/journal/model/Situation;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalThoughtModel {
    @b("acknowledge")
    private Acknowledge acknowledge;
    @b("describe")
    private Describe describe;
    @b("identify_thinking_style")
    private IdentifyThinkingStyle identifyThinkingStyle;
    @b("situation")
    private Situation situation;

    public JournalThoughtModel() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ JournalThoughtModel copy$default(JournalThoughtModel journalThoughtModel, Situation situation, Acknowledge acknowledge, Describe describe, IdentifyThinkingStyle identifyThinkingStyle, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            situation = journalThoughtModel.situation;
        }
        if ((i6 & 2) != 0) {
            acknowledge = journalThoughtModel.acknowledge;
        }
        if ((i6 & 4) != 0) {
            describe = journalThoughtModel.describe;
        }
        if ((i6 & 8) != 0) {
            identifyThinkingStyle = journalThoughtModel.identifyThinkingStyle;
        }
        return journalThoughtModel.copy(situation, acknowledge, describe, identifyThinkingStyle);
    }

    public final Situation component1() {
        return this.situation;
    }

    public final Acknowledge component2() {
        return this.acknowledge;
    }

    public final Describe component3() {
        return this.describe;
    }

    public final IdentifyThinkingStyle component4() {
        return this.identifyThinkingStyle;
    }

    public final JournalThoughtModel copy(Situation situation, Acknowledge acknowledge, Describe describe, IdentifyThinkingStyle identifyThinkingStyle) {
        i.g(situation, "situation");
        i.g(acknowledge, "acknowledge");
        i.g(describe, "describe");
        i.g(identifyThinkingStyle, "identifyThinkingStyle");
        return new JournalThoughtModel(situation, acknowledge, describe, identifyThinkingStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalThoughtModel)) {
            return false;
        }
        JournalThoughtModel journalThoughtModel = (JournalThoughtModel) obj;
        if (i.b(this.situation, journalThoughtModel.situation) && i.b(this.acknowledge, journalThoughtModel.acknowledge) && i.b(this.describe, journalThoughtModel.describe) && i.b(this.identifyThinkingStyle, journalThoughtModel.identifyThinkingStyle)) {
            return true;
        }
        return false;
    }

    public final Acknowledge getAcknowledge() {
        return this.acknowledge;
    }

    public final Describe getDescribe() {
        return this.describe;
    }

    public final IdentifyThinkingStyle getIdentifyThinkingStyle() {
        return this.identifyThinkingStyle;
    }

    public final Situation getSituation() {
        return this.situation;
    }

    public int hashCode() {
        int hashCode = this.acknowledge.hashCode();
        int hashCode2 = this.describe.hashCode();
        return this.identifyThinkingStyle.hashCode() + ((hashCode2 + ((hashCode + (this.situation.hashCode() * 31)) * 31)) * 31);
    }

    public final void setAcknowledge(Acknowledge acknowledge) {
        i.g(acknowledge, "<set-?>");
        this.acknowledge = acknowledge;
    }

    public final void setDescribe(Describe describe) {
        i.g(describe, "<set-?>");
        this.describe = describe;
    }

    public final void setIdentifyThinkingStyle(IdentifyThinkingStyle identifyThinkingStyle) {
        i.g(identifyThinkingStyle, "<set-?>");
        this.identifyThinkingStyle = identifyThinkingStyle;
    }

    public final void setSituation(Situation situation) {
        i.g(situation, "<set-?>");
        this.situation = situation;
    }

    public String toString() {
        return "JournalThoughtModel(situation=" + this.situation + ", acknowledge=" + this.acknowledge + ", describe=" + this.describe + ", identifyThinkingStyle=" + this.identifyThinkingStyle + ')';
    }

    public JournalThoughtModel(Situation situation, Acknowledge acknowledge, Describe describe, IdentifyThinkingStyle identifyThinkingStyle) {
        i.g(situation, "situation");
        i.g(acknowledge, "acknowledge");
        i.g(describe, "describe");
        i.g(identifyThinkingStyle, "identifyThinkingStyle");
        this.situation = situation;
        this.acknowledge = acknowledge;
        this.describe = describe;
        this.identifyThinkingStyle = identifyThinkingStyle;
    }

    public /* synthetic */ JournalThoughtModel(Situation situation, Acknowledge acknowledge, Describe describe, IdentifyThinkingStyle identifyThinkingStyle, int i6, d dVar) {
        this((i6 & 1) != 0 ? new Situation(null, null, null, null, 15, null) : situation, (i6 & 2) != 0 ? new Acknowledge(null, null, null, null, 15, null) : acknowledge, (i6 & 4) != 0 ? new Describe(null, null, null, null, 15, null) : describe, (i6 & 8) != 0 ? new IdentifyThinkingStyle(null, null, null, null, 15, null) : identifyThinkingStyle);
    }
}
