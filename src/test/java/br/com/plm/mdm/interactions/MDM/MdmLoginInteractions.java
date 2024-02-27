package br.com.plm.mdm.interactions.MDM;

import br.com.renner.robots.IRNRobotsTool;
import br.com.plm.mdm.pages.MDM.MdmLoginPage;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class MdmLoginInteractions extends MdmLoginPage {
    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void siteRennerMdm() {

        driverWEB.openSystem("https://mdm.lojasrenner.com.br:8081/ebx-ui/ui");
        try {

            Thread.sleep(5000);
        } catch (Exception ex) {

        }
    }

    public void loginMdm() throws Exception {
        driverWEB.click(campoUsuario);
        driverWEB.setText(campoUsuario, "testeUnitario");
        driverWEB.setFocus(campoSenha);
        driverWEB.setText(campoSenha, "!testeUnitarioMdM");
        driverWEB.click(botaoLogin);
    }

}
