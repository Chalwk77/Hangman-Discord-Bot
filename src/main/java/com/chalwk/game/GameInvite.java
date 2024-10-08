/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.game;

import net.dv8tion.jda.api.entities.User;

public class GameInvite {

    private final User invitingPlayer;
    private final User invitedPlayer;
    private final int layout;

    public GameInvite(User invitingPlayer, User invitedPlayer, int layout) {
        this.invitingPlayer = invitingPlayer;
        this.invitedPlayer = invitedPlayer;
        this.layout = layout;
    }

    public User getInvitingPlayer() {
        return invitingPlayer;
    }

    public User getInvitedPlayer() {
        return invitedPlayer;
    }

    public int getLayout() {
        return layout;
    }
}
