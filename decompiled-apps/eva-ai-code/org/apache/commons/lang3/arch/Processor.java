package org.apache.commons.lang3.arch;

import com.facebook.internal.AnalyticsEvents;
/* loaded from: classes5.dex */
public class Processor {
    private final Arch arch;
    private final Type type;

    /* loaded from: classes5.dex */
    public enum Type {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }

    /* loaded from: classes5.dex */
    public enum Arch {
        BIT_32("32-bit"),
        BIT_64("64-bit"),
        UNKNOWN(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
        
        private final String label;

        Arch(String str) {
            this.label = str;
        }

        public String getLabel() {
            return this.label;
        }
    }

    public Processor(Arch arch, Type type) {
        this.arch = arch;
        this.type = type;
    }

    public Arch getArch() {
        return this.arch;
    }

    public Type getType() {
        return this.type;
    }

    public boolean is32Bit() {
        return Arch.BIT_32.equals(this.arch);
    }

    public boolean is64Bit() {
        return Arch.BIT_64.equals(this.arch);
    }

    public boolean isX86() {
        return Type.X86.equals(this.type);
    }

    public boolean isIA64() {
        return Type.IA_64.equals(this.type);
    }

    public boolean isPPC() {
        return Type.PPC.equals(this.type);
    }
}
