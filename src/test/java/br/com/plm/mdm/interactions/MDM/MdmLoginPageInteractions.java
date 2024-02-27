package br.com.plm.mdm.interactions.MDM;

import br.com.renner.robots.IRNRobotsTool;
import br.com.plm.mdm.pages.MDM.MdmLoginPage;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class MdmLoginPageInteractions extends MdmLoginPage {
    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void siteRennerMdm() {
        driverWEB.openSystem("https://mdm.lojasrenner.com.br:8081/ebx-ui/ui/custom/dpp_bu_perspective/action/2");
    }

    public void loginMdm() throws Exception {
        driverWEB.waitObject(campoUsuario, 15);
        driverWEB.click(campoUsuario);
        driverWEB.setText(campoUsuario, "testeUnitario");
        driverWEB.setFocus(campoSenha);
        driverWEB.setText(campoSenha, "!testeUnitarioMdM");
        driverWEB.click(botaoLogin);
    }

}


