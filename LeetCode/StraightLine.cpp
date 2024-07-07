class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        if (coordinates.size() <= 2)
            return true;
        
       
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int i = 2; i < coordinates.size(); i++) {
            int xi = coordinates[i][0], yi = coordinates[i][1];
            if ((xi - x0) * dy != (yi - y0) * dx)
                return false;
        }
        
        return true;
    }
};
