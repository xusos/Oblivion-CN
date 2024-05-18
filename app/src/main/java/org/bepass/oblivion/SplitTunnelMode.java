package org.bepass.oblivion;

public enum SplitTunnelMode {
    DISABLED,
    BLACKLIST;

    public static SplitTunnelMode getSplitTunnelMode(FileManager fm) {
        SplitTunnelMode splitTunnelMode;
        try {
            splitTunnelMode = SplitTunnelMode.valueOf(fm.getString("分割隧道模式", SplitTunnelMode.DISABLED.toString()));
        } catch (Exception e) {
            splitTunnelMode = SplitTunnelMode.DISABLED;
        }
        return splitTunnelMode;
    }
}
