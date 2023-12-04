package io.grpc.netty.shaded.io.netty.handler.codec.http2;
/* loaded from: classes4.dex */
final class HpackDynamicTable {
    private long capacity = -1;
    int head;
    HpackHeaderField[] hpackHeaderFields;
    private long size;
    int tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HpackDynamicTable(long j) {
        setCapacity(j);
    }

    public int length() {
        int i = this.head;
        int i2 = this.tail;
        return i < i2 ? (this.hpackHeaderFields.length - i2) + i : i - i2;
    }

    public long size() {
        return this.size;
    }

    public long capacity() {
        return this.capacity;
    }

    public HpackHeaderField getEntry(int i) {
        if (i <= 0 || i > length()) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + length());
        }
        int i2 = this.head - i;
        if (i2 < 0) {
            HpackHeaderField[] hpackHeaderFieldArr = this.hpackHeaderFields;
            return hpackHeaderFieldArr[i2 + hpackHeaderFieldArr.length];
        }
        return this.hpackHeaderFields[i2];
    }

    public void add(HpackHeaderField hpackHeaderField) {
        long j;
        long size = hpackHeaderField.size();
        if (size > this.capacity) {
            clear();
            return;
        }
        while (true) {
            long j2 = this.capacity;
            j = this.size;
            if (j2 - j >= size) {
                break;
            }
            remove();
        }
        HpackHeaderField[] hpackHeaderFieldArr = this.hpackHeaderFields;
        int i = this.head;
        int i2 = i + 1;
        this.head = i2;
        hpackHeaderFieldArr[i] = hpackHeaderField;
        this.size = j + size;
        if (i2 == hpackHeaderFieldArr.length) {
            this.head = 0;
        }
    }

    public HpackHeaderField remove() {
        HpackHeaderField hpackHeaderField = this.hpackHeaderFields[this.tail];
        if (hpackHeaderField == null) {
            return null;
        }
        this.size -= hpackHeaderField.size();
        HpackHeaderField[] hpackHeaderFieldArr = this.hpackHeaderFields;
        int i = this.tail;
        int i2 = i + 1;
        this.tail = i2;
        hpackHeaderFieldArr[i] = null;
        if (i2 == hpackHeaderFieldArr.length) {
            this.tail = 0;
        }
        return hpackHeaderField;
    }

    public void clear() {
        while (true) {
            int i = this.tail;
            if (i != this.head) {
                HpackHeaderField[] hpackHeaderFieldArr = this.hpackHeaderFields;
                int i2 = i + 1;
                this.tail = i2;
                hpackHeaderFieldArr[i] = null;
                if (i2 == hpackHeaderFieldArr.length) {
                    this.tail = 0;
                }
            } else {
                this.head = 0;
                this.tail = 0;
                this.size = 0L;
                return;
            }
        }
    }

    public void setCapacity(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("capacity is invalid: " + j);
        } else if (this.capacity != j) {
            this.capacity = j;
            if (i == 0) {
                clear();
            } else {
                while (this.size > j) {
                    remove();
                }
            }
            int i2 = (int) (j / 32);
            if (j % 32 != 0) {
                i2++;
            }
            HpackHeaderField[] hpackHeaderFieldArr = this.hpackHeaderFields;
            if (hpackHeaderFieldArr == null || hpackHeaderFieldArr.length != i2) {
                HpackHeaderField[] hpackHeaderFieldArr2 = new HpackHeaderField[i2];
                int length = length();
                int i3 = this.tail;
                for (int i4 = 0; i4 < length; i4++) {
                    HpackHeaderField[] hpackHeaderFieldArr3 = this.hpackHeaderFields;
                    int i5 = i3 + 1;
                    hpackHeaderFieldArr2[i4] = hpackHeaderFieldArr3[i3];
                    i3 = i5 == hpackHeaderFieldArr3.length ? 0 : i5;
                }
                this.tail = 0;
                this.head = 0 + length;
                this.hpackHeaderFields = hpackHeaderFieldArr2;
            }
        }
    }
}
