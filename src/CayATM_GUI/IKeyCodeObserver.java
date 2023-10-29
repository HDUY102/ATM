
package CayATM_GUI;

import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;

public interface IKeyCodeObserver {
    public void updateKeyCodeStatus(KeyboardEnum keyCode);
    public void changeScreen(ScreenEnum nameScreen);
}
