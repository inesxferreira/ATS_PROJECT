import java.io.IOException;

public class ControllerEstado {
    public static void run(Estado estado) {
        String originalFilePath = "src/main/java/logs.txt";
        String newFilePath = "src/main/java/Estado.obj";
        boolean exit = false;
        Menu.clearWindow ();

        while (!exit) {
            int opcao = -1;
            while (opcao < 0 || opcao > 3) {
                opcao = Menu.MenuEstado ();
            }

            if (opcao == 1) {
                estado.loadEstado(originalFilePath);
            } else if (opcao == 2) {
                try {
                    estado.loadEstadoObj(newFilePath);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();

                    Menu.erros(10);
                }
            } else if (opcao == 3) {
                try {
                    estado.saveEstado(newFilePath);
                } catch (IOException e) {
                    e.printStackTrace();
                    Menu.erros(9);
                }
            } else if (opcao == 0) {
                exit = true;
                Menu.clearWindow();
            }
        }
    }
}
