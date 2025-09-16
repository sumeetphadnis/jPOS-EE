/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.q2.cli.crypto;

import java.util.Base64;
import java.util.UUID;

import org.jpos.crypto.CryptoService;
import org.jpos.crypto.SecureData;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.util.NameRegistrar;

@SuppressWarnings("unused")
public class REKEY implements CLICommand {
    private CryptoService cs;

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        cs = NameRegistrar.get("crypto-service", 5000L);
        if (args.length < 2) {
            usage(cli);
            return;
        }
        if (cs == null) {
            cli.println("'crypto-service' not registered");
            return;
        }
        int len = args.length - 1;
        for (int i=1; i<=len; i++) {
            try {
                if (len > 1) //batch
                    cli.println(String.format("rekey %d/%d", i, len));
                cs.rekey(UUID.fromString(args[i]));
            } catch (Exception e) {
                cli.println (String.format("REKEY ERROR '%s' processing key '%s'", e.getMessage(), args[i]));
            }
        }
    }

    private void usage (CLIContext cli) {
        cli.println ("Usage: REKEY uuid(s)");
    }

    private void encrypt (CLIContext cli, String clear) throws Exception {
        SecureData sd = cs.aesEncrypt(clear.getBytes());
        cli.println (sd.getId() + " " + Base64.getEncoder().encodeToString(sd.getEncoded()));
    }
}
