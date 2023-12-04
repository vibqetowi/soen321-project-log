package org.apache.commons.codec.cli;

import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.language.bm.Rule;
/* loaded from: classes5.dex */
public class Digest {
    private final String algorithm;
    private final String[] args;
    private final String[] inputs;

    public static void main(String[] strArr) throws IOException {
        new Digest(strArr).run();
    }

    private Digest(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("args");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException(String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", Digest.class.getName()));
        }
        this.args = strArr;
        this.algorithm = strArr[0];
        if (strArr.length <= 1) {
            this.inputs = null;
            return;
        }
        String[] strArr2 = new String[strArr.length - 1];
        this.inputs = strArr2;
        System.arraycopy(strArr, 1, strArr2, 0, strArr2.length);
    }

    private void println(String str, byte[] bArr) {
        println(str, bArr, null);
    }

    private void println(String str, byte[] bArr, String str2) {
        String str3;
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Hex.encodeHexString(bArr));
        if (str2 != null) {
            str3 = "  " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        printStream.println(sb.toString());
    }

    private void run() throws IOException {
        if (this.algorithm.equalsIgnoreCase(Rule.ALL) || this.algorithm.equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD)) {
            run(MessageDigestAlgorithms.values());
            return;
        }
        MessageDigest digest = DigestUtils.getDigest(this.algorithm, null);
        if (digest != null) {
            run("", digest);
        } else {
            run("", DigestUtils.getDigest(this.algorithm.toUpperCase(Locale.ROOT)));
        }
    }

    private void run(String[] strArr) throws IOException {
        for (String str : strArr) {
            if (DigestUtils.isAvailable(str)) {
                run(str + " ", str);
            }
        }
    }

    private void run(String str, MessageDigest messageDigest) throws IOException {
        String[] strArr = this.inputs;
        if (strArr == null) {
            println(str, DigestUtils.digest(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    run(str, messageDigest, listFiles);
                }
            } else {
                println(str, DigestUtils.digest(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    private void run(String str, MessageDigest messageDigest, File[] fileArr) throws IOException {
        for (File file : fileArr) {
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    private void run(String str, String str2) throws IOException {
        run(str, DigestUtils.getDigest(str2));
    }

    public String toString() {
        return String.format("%s %s", super.toString(), Arrays.toString(this.args));
    }
}
