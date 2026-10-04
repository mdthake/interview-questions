import java.time.LocalDate;
import java.util.*;

public class LeastEquippedTeam {

    record Team(String teamId, String name, String operationType, LocalDate deploymentDate) {}
    record Gear(String gearId, String name, List<String> requiredFor) {}
    record IssuedGear(String teamId, String gearId) {}

    /*
     * You are given:
     * 1. A list of teams.
     * 2. A list of gear.
     * 3. A list of gear that has already been issued to teams.
     *
     * Each team has an operation type. Each piece of gear specifies
     * which operation types require that gear.
     *
     * Determine which team is the least equipped.
     *
     * A team is considered less equipped when it is missing more of
     * the gear required for its operation type.
     *
     * If multiple teams are missing the same number of required gear
     * items, return the team with the earliest deployment date.
     */

    public static String leastEquippedTeam(
        List<Team> teams,
        List<Gear> requiredGear,
        List<IssuedGear> issuedGear
    ) {
        // Your solution
        return "";
    }

    public static void main(String[] args) {
        List<Team> teams = List.of(
            new Team("T1", "Alpha Squad", "urban_surveillance", LocalDate.of(2024, 7, 1)),
            new Team("T2", "Bravo Unit", "maritime_patrol", LocalDate.of(2024, 6, 2)),
            new Team("T3", "Shadow Cell", "urban_surveillance", LocalDate.of(2024, 6, 1)),
            new Team("T4", "Viper Squad", "border_recon", LocalDate.of(2024, 6, 5))
        );

        List<Gear> requiredGear = List.of(
            new Gear("G1", "Night Vision Goggles", List.of("urban_surveillance", "border_recon")),
            new Gear("G2", "Radio Jammer", List.of("urban_surveillance")),
            new Gear("G3", "Dive Kit", List.of("maritime_patrol")),
            new Gear("G4", "Thermal Scanner", List.of("urban_surveillance", "maritime_patrol")),
            new Gear("G5", "Drone Recon Kit", List.of("border_recon", "maritime_patrol")),
            new Gear("G6", "Camo Netting", List.of("border_recon"))
        );

        List<IssuedGear> issuedGear = List.of(
            new IssuedGear("T1", "G1"),
            new IssuedGear("T2", "G3"),
            new IssuedGear("T2", "G1"),
            new IssuedGear("T3", "G1"),
            new IssuedGear("T3", "G2"),
            new IssuedGear("T3", "G4"),
            new IssuedGear("T4", "G1")
        );

        System.out.println(leastEquippedTeam(teams, requiredGear, issuedGear));
    }
}